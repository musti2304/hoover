package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PerformanceController implements Initializable {

    @FXML
    private ChoiceBox choiceBoxSocialPerformance;
    @FXML
    private TextField txtTargetValue;
    @FXML
    private TextField txtActualValue;
    @FXML
    private TextField txtBonus;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnCancel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnAdd.setOnAction(this::add);
        btnCancel.setOnAction(this::cancel);
    }

    @FXML
    private void add(ActionEvent event) {
        // Todo
    }

    @FXML
    private void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
}