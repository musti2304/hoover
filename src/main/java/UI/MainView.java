package UI;

import Database.Connection;
import Database.DatabaseController;
import Model.Salesman;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainView extends Application {

    @FXML
    private Label labelOutput;
    @FXML
    private Button btnSalesman;
    @FXML
    private Button btnPerformance;
    @FXML
    private Button btnEvaluation;
    @FXML
    private Button btnLoadData;

    @FXML
    private TableColumn<Salesman, Integer> tblSalesmanId;

    @FXML
    private TableView<Salesman> tableViewSalesman;


    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = new File("src/main/resources/main.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root, 960, 600);
        primaryStage.setTitle("Hoover Ltd.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void addSalesman() throws Exception {
        URL url = new File("src/main/resources/add_salesman.fxml").toURI().toURL();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(url.openStream());

        Stage salesmanStage = new Stage();
        Scene scene = new Scene(root, 700, 400);

        salesmanStage.setScene(scene);
        salesmanStage.setTitle("Add Salesman");
        salesmanStage.show();
    }

    @FXML
    private void addPerformanceRecord() throws Exception {
        URL url = new File("src/main/resources/add_performance.fxml").toURI().toURL();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(url.openStream());

        Stage performanceStage = new Stage();
        Scene scene = new Scene(root, 700, 400);

        performanceStage.setScene(scene);
        performanceStage.setTitle("Add Performance Record");
        performanceStage.show();
    }

    @FXML
    private void addEvaluationRecord() throws Exception {
        URL url = new File("src/main/resources/add_evaluation.fxml").toURI().toURL();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(url.openStream());

        Stage evaluationStage = new Stage();
        Scene scene = new Scene(root, 700, 400);

        evaluationStage.setScene(scene);
        evaluationStage.setTitle("Add Evaluation Record");
        evaluationStage.show();
    }

    @FXML
    private void loadData() {
        labelOutput.setText("Connecting..");
        Connection connection = new Connection("localhost", 27017,
                "salesman", "salesman");
        DatabaseController databaseController = new DatabaseController(connection);
        labelOutput.setText("Fetching data..");
//        databaseController.readSalesMan();
    }

    public void setLabelOutput(String text) {
        labelOutput.setText(text);
    }

}
