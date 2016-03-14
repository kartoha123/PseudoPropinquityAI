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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

    @FXML
    private TableView<Row> table;
    @FXML
    private TableColumn<Row, Integer> columnId;
    @FXML
    private TableColumn<Row, String> columnFA;
    @FXML
    private TableColumn<Row, String> columnFB;
    @FXML
    private TableColumn<Row, String> columnProp;
    @FXML
    private Button addBtn;
    private Button editBtn;

    @FXML
    private void handleAddButtonAction(ActionEvent event) {
        System.out.println("handleAddButtonAction action performed");
        //data.add(new Row());
        
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/EditorElementScene.fxml"));
            Stage stage = new Stage();
            stage.setTitle("New row");
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleEditButtonAction(ActionEvent event) {
        System.out.println("handleEditButtonAction action performed");
    }

    private ObservableList<Row> data
            = FXCollections.observableArrayList(
                    new Row(1, "fewf", "rfef", "effew"),
                    new Row(),
                    new Row(),
                    new Row(),
                    new Row()
            );

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        columnId.setCellValueFactory(new PropertyValueFactory<Row, Integer>("id"));

        columnFA.setCellValueFactory(new PropertyValueFactory<Row, String>("figureA"));

        columnFB.setCellValueFactory(new PropertyValueFactory<Row, String>("figureB"));

        columnProp.setCellValueFactory(new PropertyValueFactory<Row, String>("propinquity"));

        table.setItems(data);
    }
}
