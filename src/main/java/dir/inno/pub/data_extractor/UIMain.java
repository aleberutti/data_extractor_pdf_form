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
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

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
    
    private Scene mainScreen;
    private AnchorPane pantallaRaiz;
    private ListView listaArchivos;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///D:/Netbeans/Proyectos/data_extractor_pdf_form/src/main/resources/fxml/MainScene.fxml"));
        //D:\Netbeans\Proyectos\data_extractor_pdf_form\src\main\resources\fxml\MainScene.fxml
        
        MainSceneController controlador = new MainSceneController();
        controlador.cargarListView();
        
        pantallaRaiz = loader.<AnchorPane>load();
        mainScreen = new Scene(pantallaRaiz);
        primaryStage.setScene(mainScreen);
        primaryStage.setTitle("Interfaz principal");
        primaryStage.show();
        
       
    }
    
    
}
