/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dir.inno.pub.data_extractor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Controladores.*;
import Modelo.ArchivoXML;
import java.io.IOException;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author MODERNIZACION04
 */


public class UIMain extends Application {
    /**
     * https://code.makery.ch/es/library/javafx-tutorial/part1/
     * http://tutorials.jenkov.com/javafx/fxml.html
     * https://www.callicoder.com/javafx-fxml-form-gui-tutorial/
     */
    private Stage stagePrimario;
    private BorderPane rootLayout;
    private ObservableList<ArchivoXML> listaArchivos = FXCollections.observableArrayList(); 
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        this.stagePrimario = primaryStage;
        this.stagePrimario.setTitle("Título Random");
        initRootLayout();
        showMainScene();   
    }
    
    /**
     * inicializa rootLayout
     */
    public void initRootLayout(){
        try{
            //cargo el layout raiz desde el archivo fxml
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new URL("file:///D:/Netbeans/Proyectos/data_extractor_pdf_form/src/main/resources/fxml/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            //muestro el contenido dentro del layout raiz
            Scene scene = new Scene(rootLayout);
            stagePrimario.setScene(scene);
            stagePrimario.show(); 
        }
        catch(IOException e){
            e.printStackTrace();
        };
    }
    
    /**
     * inicializa mainScene
     */
    public void showMainScene(){
        try{
            //cargo el mainscene desde el archivo fxml
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new URL("file:///D:/Netbeans/Proyectos/data_extractor_pdf_form/src/main/resources/fxml/MainScene.fxml"));
            AnchorPane rootAnchorPane = (AnchorPane) loader.load();
            
            //seteo el mainscene al centro del scene raiz
            rootLayout.setCenter(rootAnchorPane);
        }
        catch(IOException e){
            e.printStackTrace();
        };
    }
    
    /**
     * retorna el stage principal
     * @return 
     */
    public Stage getStagePrimario(){
        return stagePrimario;
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   /**
    * constructor UIMain
    */
    public UIMain(){
        //agrego datos de prueba
        listaArchivos.add(new ArchivoXML("Archivo 1.xml"));
        listaArchivos.add(new ArchivoXML("Archivo 2.xml"));
        listaArchivos.add(new ArchivoXML("Archivo 3.xml"));
    }
    
    /**
     * getter para obtener la observableList de archivos
     * @return 
     */
    public ObservableList<ArchivoXML> getListaArchivos(){
        return listaArchivos;
    }
}
