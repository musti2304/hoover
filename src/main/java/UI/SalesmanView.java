package UI;

import Database.Connection;
import Database.DatabaseController;
import Model.Salesman;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalesmanView implements Initializable {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtDepartment;
    @FXML
    private TextField txtPerformanceYear;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnAdd;


    @FXML
    public void add(ActionEvent event) {
        try {
            URL url = new File("src/main/resources/main.fxml").toURI().toURL();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = (Parent) fxmlLoader.load(url.openStream());
            MainView mainView = (MainView) fxmlLoader.getController();
            mainView.setLabelOutput("Hiiiiii");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    @FXML
    private void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}