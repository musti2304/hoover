package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalesmanController implements Initializable {

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnAdd.setOnAction(this::add);
        btnCancel.setOnAction(this::cancel);
    }

    private void add(ActionEvent event) {
        // TODO: This fuck does not work!!!!!!!!
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/main_view.fxml"));
            Parent root = fxmlLoader.load();

            MainController mainController = fxmlLoader.getController();
            mainController.setLabelOutput(txtName.getText());

            ((Node) event.getSource()).getScene().getWindow().hide();

        } catch (IOException e) {
            e.getMessage();
        }
    }

    private void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

}