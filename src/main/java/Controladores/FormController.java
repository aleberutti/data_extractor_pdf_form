/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.*;
import java.io.IOException;
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
public class FormController {
    
    //Unused//public HashMap<String, Nodo> form;
    public FileController filecontroller;
    public Document doc;
    
    //Public constructor
    public FormController(String path) throws Exception{
        //Unused//this.form= new HashMap();
        this.filecontroller = new FileController(path);
        filecontroller.cargar();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        this.doc=dBuilder.parse(filecontroller.getArchivo());
    }
    
    //Método que realiza un call del método recursivo y devuelve el valor modificado
    public String getDataForm(String xpath){
        doc.getDocumentElement().normalize();
        
        StringBuilder value= new StringBuilder();     
        
        //Call al método recursivo con la raíz del xml tree y el camino a seguir hacia el nodo deseado
        this.NodeSearcher(doc.getDocumentElement(), xpath, value);
        
        return value.toString();
    }
    
    //Método recursivo para la obtención de un dato mediante su camino al nodo en el archivo xml
    public void NodeSearcher(Node nNode, String xpath, StringBuilder value){
        StringTokenizer st= new StringTokenizer(xpath, ".");
        
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
                    NodeSearcher(e.getElementsByTagName(nodeName).item(0),st.nextToken("\n"), value);
                }
            }
        }
    }
    
    
}
