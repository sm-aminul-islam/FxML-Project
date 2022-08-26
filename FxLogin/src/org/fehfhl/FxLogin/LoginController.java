/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fehfhl.FxLogin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author devil
 */
public class LoginController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private TextField textUsername;
    @FXML
    private PasswordField textpassword;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(event.getSource()==button){
          String username=textUsername.getText();
          String password=textpassword.getText();
          if(username.equalsIgnoreCase("Admin")&& password.equalsIgnoreCase("Admin")){
              System.out.println("Successfully Login");
             Stage primaryStage=new Stage();
             Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
     
          }
          else{
              System.out.println("Username/password combination not found");
          }
          
    }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
