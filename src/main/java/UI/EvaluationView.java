package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EvaluationView implements Initializable {
    @FXML
    private TextField txtProductName;
    @FXML
    private TextField txtClient;
    @FXML
    private TextField txtRanking;
    @FXML
    private TextField txtItems;
    @FXML
    private TextField txtBonus;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnCancel;

    @FXML
    private void add() {

    }

    @FXML
    private void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}