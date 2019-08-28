/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import dir.inno.pub.data_extractor.UIMain;
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
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author MODERNIZACION04
 */
public class UIMainSceneController{
    
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
    private ListView<String> listViewArchivos;
    @FXML
    private URL url; 
    @FXML
    private ResourceBundle rb;
    
    private UIMain ui;
    private ObservableList<String> listaArchivos = FXCollections.observableArrayList(); 
    
    /**
     * Constructor. Debe ser llamado antes del método initialize
     */
    public UIMainSceneController(){
        
    }
    
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void initialize() {
        
        ObservableList<String> listaArchivos = FXCollections.observableArrayList(); 

        listaArchivos.add(("Archivo 1.xml"));
        listaArchivos.add(("Archivo 2.xml"));
        listaArchivos.add(("Archivo 3.xml"));
        
        listViewArchivos.setItems(listaArchivos);
        listViewArchivos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //System.out.println(listaArchivos.toString());
        
    }
    
    
    @FXML
    public void buttonDelete(){
        String item;
        item = this.listViewArchivos.getSelectionModel().getSelectedItem();
        this.listViewArchivos.getItems().remove(item);
        
    }

}
