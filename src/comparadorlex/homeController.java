/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadorlex;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Luis Manuel
 */
public class homeController implements Initializable {
    
    Especificos especifico = new Especificos();
    
    @FXML
    private Label labelTokenEspecific;
    @FXML
    private Label labelTokentipo;
    @FXML
    private Label labelTokenLetras;
    @FXML
    private Label labelnotFound;
 
    @FXML
    private TextField parametro;
    ArrayList<String> palabra; 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String[] word = parametro.getText().split("-");
        String especificos="";
        String tipo="";
        String letras="";
        String notFound ="";
        for (int i = 0; i < word.length; i++) {
            if (especifico.tokenSEspecificos(word[i])) {
                especificos = especificos.concat(word[i]+"---");
            labelTokenEspecific.setText(especificos+"--------se encontro en el token de especificos");
        }else if (especifico.tokensTipo(word[i])){
            tipo = tipo.concat(word[i]+"---");
            labelTokentipo.setText(tipo+"--------se encontro en el token de tipo");
        }else if(especifico.tokensLetras(word[i])){
            letras = letras.concat(word[i]+"---");
            labelTokenLetras.setText(letras+"--------se encontro en el token de letras");
        }else{
            notFound = notFound.concat(word[i]+"---");
            labelnotFound.setStyle("-fx-background-color: orange;");
           
            labelnotFound.setText(notFound+"----No se encontro en el lexico");
        }
       }
         
    }
    @FXML
    public void limpiarCampos(){
        labelTokenEspecific.setText("Especificos");
        labelTokentipo.setText("Tipo");
        labelTokenLetras.setText("Letras");
        labelnotFound.setText("No encontrados");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
