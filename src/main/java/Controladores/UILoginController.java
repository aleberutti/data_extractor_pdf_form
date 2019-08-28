/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

package Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class UILoginController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="imgIconLogin"
    private ImageView imgIconLogin; // Value injected by FXMLLoader

    @FXML // fx:id="anchorPaneLoginRoot"
    private AnchorPane anchorPaneLoginRoot; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalir"
    private Button btnSalir; // Value injected by FXMLLoader

    @FXML // fx:id="btnMinimizar"
    private Button btnMinimizar; // Value injected by FXMLLoader

    @FXML // fx:id="anchorPaneDatosLogin"
    private AnchorPane anchorPaneDatosLogin; // Value injected by FXMLLoader

    @FXML // fx:id="imgButtonCerrar"
    private ImageView imgButtonCerrar; // Value injected by FXMLLoader

    @FXML // fx:id="imgBtnMinimizar"
    private ImageView imgBtnMinimizar; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldUsername"
    private TextField textFieldUsername; // Value injected by FXMLLoader

    @FXML // fx:id="btnInicioSesion"
    private Button btnInicioSesion; // Value injected by FXMLLoader

    @FXML // fx:id="passwordFieldLogin"
    private PasswordField passwordFieldLogin; // Value injected by FXMLLoader

    @FXML // fx:id="imgLogin"
    private ImageView imgLogin; // Value injected by FXMLLoader

    @FXML // fx:id="btnCerrar"
    private Button btnCerrar; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert imgIconLogin != null : "fx:id=\"imgIconLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert anchorPaneLoginRoot != null : "fx:id=\"anchorPaneLoginRoot\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnMinimizar != null : "fx:id=\"btnMinimizar\" was not injected: check your FXML file 'Login.fxml'.";
        assert anchorPaneDatosLogin != null : "fx:id=\"anchorPaneDatosLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert imgButtonCerrar != null : "fx:id=\"imgButtonCerrar\" was not injected: check your FXML file 'Login.fxml'.";
        assert imgBtnMinimizar != null : "fx:id=\"imgBtnMinimizar\" was not injected: check your FXML file 'Login.fxml'.";
        assert textFieldUsername != null : "fx:id=\"textFieldUsername\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnInicioSesion != null : "fx:id=\"btnInicioSesion\" was not injected: check your FXML file 'Login.fxml'.";
        assert passwordFieldLogin != null : "fx:id=\"passwordFieldLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert imgLogin != null : "fx:id=\"imgLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnCerrar != null : "fx:id=\"btnCerrar\" was not injected: check your FXML file 'Login.fxml'.";
    }
    
    @FXML
    public void btnCerrarLogin(){
      
    }
}
