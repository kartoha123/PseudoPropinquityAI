package com.bunjlabs.pseudopropinquityai.editor;

import com.bunjlabs.pseudopropinquityai.Row;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class EditorElementSceneController implements Initializable {

    @FXML private Button submit;
    @FXML public ChoiceBox propinquity;
    
    private ObservableList<String> data
            = FXCollections.observableArrayList(
                    "yes",
                    "no"
            );
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        propinquity.setItems(data);
        //propinquity.set
    }
    
    @FXML
    private void handleDrawAButtonAction(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/EditorElementScene.fxml"));
            Stage stage = new Stage();
            stage.setTitle("New figure");
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("handleDrawAButtonAction action performed in EditorElementScene");
        
    }
    
    @FXML
    private void handleDrawBButtonAction(ActionEvent event) {
        System.out.println("handleDrawBButtonAction action performed in EditorElementScene");
        
    }
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("handleSubmitButtonAction action performed in EditorElementScene");
        
    }
    
}
