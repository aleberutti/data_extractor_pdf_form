/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author MODERNIZACION04
 */
public class MainSceneController implements Initializable {
    
    @FXML
    private AnchorPane RootAnchorPane;
    @FXML
    private VBox VBox1;
    @FXML
    private ImageView ImgSantaFe;
    @FXML
    private Button ButtonCargar;
    @FXML
    private ImageView ImgButtonCargar;
    @FXML
    private Button ButtonEliminar;
    @FXML
    private ImageView ImgButtonEliminar;
    @FXML
    private Button ButtonProcesarLista;
    @FXML
    private ImageView ImgButtonProcesarLista;
    @FXML
    private Button ButtonCerrarSesion;
    @FXML
    private ImageView ImgButtonCerrarSesion;
    @FXML
    private VBox VBox2;
    @FXML
    private AnchorPane AnchorPane1Archivos;
    @FXML
    private Label LabelExtraccionDatos;
    @FXML
    private Label LabelArchivos;
    @FXML
    private ScrollPane ScrollPaneArchivos;
    @FXML
    private AnchorPane AnchorPane2Archivos;
    @FXML
    private ListView ListViewArchivos;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }

}
