/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
//Singleton Class // Solo se creará una sola instancia que manejará distintos archivos xml mediante el cambio del path
public class FormController {
    //Singleton
    
    private static FormController instance;
    
    //Unused//public HashMap<String, Nodo> form;
    public FileController filecontroller;
    public Document doc;
    public String path;
    
    //Public empty constructor
    private FormController() {
    }
    //getInstance del patrón singleton
    public static synchronized FormController getInstance(){
    if(instance==null){
        instance = new FormController();
    }
    return instance;
    }
    //Se carga el archivo xml y se obtiene el documento raíz
    public void loadXML()throws Exception{
        this.filecontroller = new FileController(this.path);
        filecontroller.cargar();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        this.doc=dBuilder.parse(filecontroller.getArchivo());
    }
    

    
    //Método que realiza un call del método recursivo y devuelve el valor modificado
    public String getSimpleDataForm(String xpath){
        doc.getDocumentElement().normalize();
        
        StringBuilder value= new StringBuilder();     
        
        //Call al método recursivo con la raíz del xml tree y el camino a seguir hacia el nodo deseado
        this.SimpleNodeSearcher(doc.getDocumentElement(), xpath, value);
        
        return value.toString();
    }
    //Método que realiza un call del método recursivo y devuelve una lista con los valores, se utiliza para campos dinámicos como las actividades
    public ArrayList <Node> getComplexDataForm(String xpath){
        doc.getDocumentElement().normalize();
        ArrayList <Node> nodes = new ArrayList<>();
        
        //Call al método recursivo con la raíz del xml tree y el camino a seguir hacia el nodo deseado
        this.ComplexNodeSearcher(doc.getDocumentElement(), xpath, nodes);
        
        return nodes;
    }
    
    //Método recursivo para la obtención de un dato mediante su camino al nodo en el archivo xml
    public void SimpleNodeSearcher(Node nNode, String xpath, StringBuilder value){
        StringTokenizer st= new StringTokenizer(xpath, ".");
        System.out.println(xpath);
        while(st.hasMoreTokens()){
            //Caso base del método recursivo
            if(st.countTokens()==1){
                String nodeName= st.nextToken();
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nNode;
                    //Modificamos el valor pasado como parámetro
                    value.append(e.getElementsByTagName(nodeName).item(0).getTextContent());
                    break;
                }
            }
            else{
                //Recursividad
                String nodeName= st.nextToken();
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nNode;
                    SimpleNodeSearcher(e.getElementsByTagName(nodeName).item(0),st.nextToken("\n"), value);
                }
            }
        }
    }
    public void ComplexNodeSearcher (Node nNode, String xpath, ArrayList<Node> value){
        StringTokenizer st= new StringTokenizer(xpath, ".");
        System.out.println(xpath);
        while(st.hasMoreTokens()){
            //Caso base del método recursivo
            if(st.countTokens()==1){
                String nodeName= st.nextToken();
                System.out.println(nodeName);
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nNode;
                    NodeList nList = e.getElementsByTagName(nodeName);
                    //System.out.println(nList.getLength());
                    if (nList.getLength()>=1){
                        //Modificamos el valor pasado como parámetro
                        for (int i = 0; i<nList.getLength(); i++ ){
                            value.add(nList.item(i));
                        }
                    }
                    break;
                }
            }
            else{
                //Recursividad
                String nodeName= st.nextToken();
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element e = (Element) nNode;
                    ComplexNodeSearcher(e.getElementsByTagName(nodeName).item(0),st.nextToken("\n"), value);
                }
            }
        }
    }
    public void setPath(String path){
        this.path=path;    
    }
    
    
}
