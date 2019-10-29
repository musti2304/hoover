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

public class PerformanceView implements Initializable {

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

    @FXML
    private void add() {

    }

    @FXML
    public void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}