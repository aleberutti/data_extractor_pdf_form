/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author MODERNIZACION04
 */
public class ArchivoXML {
    
    private final StringProperty path;
    
    /**
     * constructor por default
     */
    public ArchivoXML(){
        this.path = null;
    }
    
    /**
     * constructor con datos por parámetro
     * @param
     */
    public ArchivoXML(String path){
        this.path = new SimpleStringProperty(path);
    }
    
    public String getArchivoXMLPath(){
        return path.get();
    }
    
    public void setArchivoXMLPath(String path){
        this.path.set(path);
    }
    
}
