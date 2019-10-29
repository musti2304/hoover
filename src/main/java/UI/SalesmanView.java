package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalesmanView implements Initializable {

    private MainView mainView;
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


//    @FXML
//    public void add(ActionEvent event) {
//        //            URL url = new File("src/main/resources/main.fxml").toURI().toURL();
//        FXMLLoader fxmlLoader = new FXMLLoader();
////            Parent root = (Parent) fxmlLoader.load(url.openStream());
//        mainView = (MainView) fxmlLoader.getController();
//        mainView.setLabelOutput("Hiiiiii");
//        //        ((Node) event.getSource()).getScene().getWindow().hide();
//    }

//    @FXML
//    private void cancel(ActionEvent event) {
//        ((Node) event.getSource()).getScene().getWindow().hide();
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnAdd.setOnAction(this::add);
        btnCancel.setOnAction(this::cancel);
    }

    private void cancel(ActionEvent event) {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    private void add(ActionEvent event) {
        try {
//            URL url = new File("src/main/resources/main.fxml").toURI().toURL();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src/main/resources/main.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            MainView mainView = fxmlLoader.<MainView>getController();
            mainView.setLabelOutput(txtName.getText());
            ((Node) event.getSource()).getScene().getWindow().hide();

        } catch (IOException e) {
            e.getMessage();
        }
    }
}