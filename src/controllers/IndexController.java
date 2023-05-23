/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    @FXML
    private Button btn_Crear;
    @FXML
    private Button btn_Actualizar;
    @FXML
    private Button btn_Consultar;
    @FXML
    private Button btn_Eliminar;
    
   

  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbDataBases.getItems().addAll(myQueriesManager.getQuery());
    }

    @FXML
    private void doActualizar(ActionEvent event) {
       
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/create.fxml"));
            Parent root = loader.load();
            UpdateController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

            Stage stage1 = (Stage) this.btn_Actualizar.getScene().getWindow();
            stage1.close();
            stage.setResizable(false);

        } catch (Exception ex) {
            //Logger.getLogger(TodosCarrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void doCrear(ActionEvent event) {
        
         try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/create.fxml"));
            Parent root = loader.load();
            CreateController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

            Stage stage1 = (Stage) this.btn_Crear.getScene().getWindow();
            stage1.close();
            stage.setResizable(false);

        } catch (Exception ex) {
            //Logger.getLogger(TodosCarrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void doConsultar(ActionEvent event) {
        
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/create.fxml"));
            Parent root = loader.load();
            ReadController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

            Stage stage1 = (Stage) this.btn_Consultar.getScene().getWindow();
            stage1.close();
            stage.setResizable(false);

        } catch (Exception ex) {
            //Logger.getLogger(TodosCarrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void doEliminar(ActionEvent event) {
        
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/create.fxml"));
            Parent root = loader.load();
            DeleteController controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.show();

            Stage stage1 = (Stage) this.btn_Eliminar.getScene().getWindow();
            stage1.close();
            stage.setResizable(false);

        } catch (Exception ex) {
            //Logger.getLogger(TodosCarrosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    

}
