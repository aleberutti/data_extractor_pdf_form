/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
/**
 *
 * @author Admin
 */
public class Nodo {
    public String name;
    public Element value;
    public Node node;
    public NodeList childs;
    
    public Nodo (Node n){
        this.node=n;
        this.name=n.getNodeName();
        
        if (this.node.getNodeType() == Node.ELEMENT_NODE){
            this.value = (Element)n;
        }
        
        if (this.node.hasChildNodes()){
            this.childs= this.node.getChildNodes();
        }
    }
    
    public boolean isLeaf(){
        if(this.childs.getLength()==0 && !this.node.hasChildNodes()){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value.getTextContent();
    }

    public void setValue(Element value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public NodeList getChilds() {
        return childs;
    }

    public void setChilds(NodeList childs) {
        this.childs = childs;
    }
}
