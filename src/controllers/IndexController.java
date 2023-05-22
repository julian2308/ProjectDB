/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import managers.QueriesManager;

/**
 * FXML Controller class
 *
 * @author julia_z20imv5
 */
public class IndexController implements Initializable {

    private QueriesManager myQueriesManager = new QueriesManager();
    
    @FXML
    private ChoiceBox<String> cbDataBases;
    
   

  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbDataBases.getItems().addAll(myQueriesManager.getQuery());
    }


    

}
