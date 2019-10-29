package UI;

import Model.Salesman;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    private VBox vBoxRoot;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label lblOutput;
    @FXML
    private Button btnSalesman;
    @FXML
    private Button btnPerformance;
    @FXML
    private Button btnEvaluation;
    @FXML
    private Button btnLoadData;

    @FXML
    private TableView<Salesman> tableViewSalesman;
    @FXML
    private TableColumn<Salesman, Integer> tblSalesmanId;
    @FXML
    private TableColumn<Salesman, String> tblSalesmanName;
    @FXML
    private TableColumn<Salesman, String> tblSalesmanDepartment;
    @FXML
    private TableColumn<Salesman, Integer> tblSalesmanYear;


    private SalesmanController salesmanController;
    private PerformanceController performanceController;
    private EvaluationController evaluationController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btnSalesman.setOnAction(event -> {
            try {
                addSalesman();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnPerformance.setOnAction(event -> {
            try {
                addPerformanceRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnEvaluation.setOnAction(event -> {
            try {
                addEvaluationRecord();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        btnLoadData.setOnAction(event -> {
//            tableViewSalesman = new TableView<>();
//
//            tblSalesmanId = new TableColumn<>();
//            tblSalesmanId.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
//
//            tblSalesmanName = new TableColumn<>();
//            tblSalesmanName.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
//
//            tblSalesmanDepartment = new TableColumn<>();
//            tblSalesmanDepartment.setCellValueFactory(new PropertyValueFactory<>("department"));
//
//            tblSalesmanYear = new TableColumn<>();
//            tblSalesmanYear.setCellValueFactory(new PropertyValueFactory<>("performanceYear"));
            loadData();
        });
    }

    /**
     * Loads the view to add new Salesman
     */
    private void addSalesman() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/add_salesman.fxml"));
            Parent root = fxmlLoader.load();

            Stage salesmanStage = new Stage();
            Scene scene = new Scene(root, 700, 400);

            salesmanStage.setScene(scene);
            salesmanStage.setTitle("Add Salesman");
            salesmanStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the view to add new Performance records
     */
    private void addPerformanceRecord() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/add_performance.fxml"));
            Parent root = fxmlLoader.load();

            Stage performanceStage = new Stage();
            Scene scene = new Scene(root, 700, 400);

            performanceStage.setScene(scene);
            performanceStage.setTitle("Add Performance Record");
            performanceStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the view to add new Evaluation records
     */
    private void addEvaluationRecord() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/add_evaluation.fxml"));
            Parent root = fxmlLoader.load();

            Stage evaluationStage = new Stage();
            Scene scene = new Scene(root, 700, 400);

            evaluationStage.setScene(scene);
            evaluationStage.setTitle("Add Evaluation Record");
            evaluationStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets all the data from the database
     */
    private void loadData() {
//        lblOutput.setText("Connecting..");
//        Connection connection = new Connection("localhost", 27017,
//                "salesman", "salesman");
//        DatabaseController databaseController = new DatabaseController(connection);
        lblOutput.setText("Fetching data..");
//        databaseController.readSalesMan();
//        tableViewSalesman.setItems(fillData());

    }

    public void setLabelOutput(String text) {
        lblOutput.setText(text);
    }


//    private ObservableList<Salesman> fillData() {
//        ObservableList<Salesman> salesmen = FXCollections.observableArrayList();
//        salesmen.add(new Salesman(1001, "Musti", "HR", 2019));
//        salesmen.add(new Salesman(1002, "Musti2", "HR2", 2018));
//        salesmen.add(new Salesman(1003, "Musti3", "HR3", 2013));
//        return salesmen;
//    }
}
