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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Admin
 */
public class FormController {
    
    public HashMap<String, Nodo> form;
    public FileController filecontroller;
    public Document doc;
    
    public FormController(String path) throws Exception{
        this.form= new HashMap();
        this.filecontroller = new FileController(path);
        filecontroller.cargar();
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        this.doc=dBuilder.parse(filecontroller.getArchivo());
    }
    
    public String getDataForm(){
        doc.getDocumentElement().normalize();
        
        StringBuilder builder;
        
        
        builder = this.NodeIterator(doc.getDocumentElement().getChildNodes());
        
        return builder.toString();
    }
    
    public StringBuilder NodeIterator (NodeList childNodes){
        StringBuilder builder = new StringBuilder();
        
        for (int i=0; i<childNodes.getLength();i++){
            Node node= childNodes.item(i);
            
            if (node.hasChildNodes()){
                
                //System.out.println(node.getNodeName() + "----------> Tiene hijitos");
                
                if(node.getChildNodes().getLength()==1 && node.getChildNodes().item(0).getNodeType()== Node.TEXT_NODE){
                    
                    Nodo n = new Nodo(node);
                    System.out.println(node.getNodeName() + "----------> Node name.");
                    System.out.println(n.getValue()+ "----------> Value.");
                    this.form.put(n.getName(), n);
                    if(!n.getValue().isEmpty())builder.append(n.getValue()).append(".\n");
                }
                else{
                    //System.out.println(node.getNodeName() + "----------> No es del tipo texto");
                    NodeIterator(node.getChildNodes());
                }
            }
//            if (node.hasChildNodes()){
//                System.out.println(node.getNodeName() + "----------> Tiene hijitos");
//                System.out.println(node.getNodeType() + "----------> Type.");
//                NodeIterator(node.getChildNodes());
//                
//            }
//            else{
//                System.out.println(node.getNodeName() + "----------> No tiene hijitos.");
//                System.out.println(node.getNodeType() + "----------> Type.");
//                if (node.getNodeType() == Node.ELEMENT_NODE){
//                    Nodo n = new Nodo(node);
//                    System.out.println(n.getName() + "----------> No tiene hijitos y es del tipo elemento.");
//                    this.form.put(n.getName(), n);
//                }
//            }
            
        }
        
        
        return builder;
    }
    
    
}
