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
    private AnchorPane rootAnchorPane;
    @FXML
    private VBox vBox1;
    @FXML
    private ImageView imgSantaFe;
    @FXML
    private Button buttonCargar;
    @FXML
    private ImageView imgButtonCargar;
    @FXML
    private Button buttonEliminar;
    @FXML
    private ImageView imgButtonEliminar;
    @FXML
    private Button buttonProcesarLista;
    @FXML
    private ImageView imgButtonProcesarLista;
    @FXML
    private Button buttonCerrarSesion;
    @FXML
    private ImageView imgButtonCerrarSesion;
    @FXML
    private VBox vBox2;
    @FXML
    private Label labelExtraccionDatos;
    @FXML
    private Label labelArchivos;
    @FXML
    private ScrollPane scrollPaneArchivos;
    @FXML
    private AnchorPane anchorPaneArchivos;
    @FXML
    private ListView listViewArchivos;
    
    @FXML
    private URL url;
     
    @FXML
    private ResourceBundle rb;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    
    
    public void cargarListView(){
        listViewArchivos = new ListView();
        listViewArchivos.getItems().add("Archivo pdf 1.pdf");
        listViewArchivos.getItems().add("Archivo pdf 2.pdf");
        listViewArchivos.getItems().add("Archivo pdf 3.pdf"); 
        
        vBox2 = new VBox(listViewArchivos);
        rootAnchorPane = new AnchorPane(vBox2);
    }

}
