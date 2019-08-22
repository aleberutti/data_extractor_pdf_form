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
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author MODERNIZACION04
 */


public class UIMain extends Application {
    /**
     * https://code.makery.ch/es/library/javafx-tutorial/part1/
     */
    
    private Stage mainScreen;
    private AnchorPane pantallaRaiz;
    
    @Override
    public void start(Stage primaryStage) {
        this.mainScreen = primaryStage;
        this.mainScreen.setTitle("Pantalla principal");
        
        initMainScreen();
    }

    
    
      /**
     * Inicializa la pantalla principal.
     */
    public void initMainScreen() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(UIMain.class.getResource("D:\\Netbeans\\Proyectos\\data_extractor_pdf_form\\src\\main\\resources\\fxml\\MainScene.fxml"));
            pantallaRaiz = (AnchorPane) loader.load();
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(pantallaRaiz);
            mainScreen.setScene(scene);
            mainScreen.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return mainScreen;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
    
    
    /* @Override
    public void start(Stage primaryStage) {
        //Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            
        //    @Override
        //    public void handle(ActionEvent event) {
        //        System.out.println("Hello World!");
        //    }
        //});
        
        /*StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }*/
}
