/*
 * 
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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class homeController implements Initializable {
    
    TokensClass tokens = new TokensClass();
    
    @FXML
    private Label labelTokenEspecific;
    @FXML
    private Label labelTokentipo;
    @FXML
    private Label labelTokenLetras;
    @FXML
    private Label labelnotFound;
    @FXML
    private ListView<String> listViewEspecificos;
    @FXML
    private ListView<String> listViewLetras;
    @FXML
    private ListView<String> listViewNoEncontrado;
    @FXML
    private ListView<String> listViewTipo;
    @FXML
    private TextField parametro;
    ArrayList<String> palabra; 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String[] word = parametro.getText().split("-");
        for (int i = 0; i < word.length; i++) {
            if (tokens.tokenSEspecificos(word[i])) {
                listViewEspecificos.getItems().add(word[i]);
            }else if (tokens.tokensTipo(word[i])){
            	listViewTipo.getItems().add(word[i]);
            }else if(tokens.tokensLetras(word[i])){
            	listViewLetras.getItems().add(word[i]);
            }else{
            	listViewNoEncontrado.getItems().add(word[i]);
            }
        }
    }
    @FXML
    public void limpiarCampos(){
        listViewEspecificos.getItems().clear();
        listViewLetras.getItems().clear();
        listViewNoEncontrado.getItems().clear();
        listViewTipo.getItems().clear();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
