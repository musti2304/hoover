package Login;

import Client.Start;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginView extends Application {

    private GridPane gridPane;
    private final Text actionTarget;
    private Text sceneTitle;
    private Label userName;
    private Label userPassword;
    private TextField userNameTextField;
    private PasswordField passwordField;
    private Scene scene;
    private Button button;
    private HBox hBox;

    public LoginView() {
        gridPane = new GridPane();
        sceneTitle = new Text("Welcome to Hoover");
        userName = new Label("User Name:");
        userPassword = new Label("Password:");
        userNameTextField = new TextField();
        passwordField = new PasswordField();
        actionTarget = new Text();
        scene = new Scene(gridPane, 300, 275);
        button = new Button("Login");
        hBox = new HBox(10);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Hoover Ltd. Login");
        primaryStage.setWidth(600.0);
        primaryStage.setHeight(300.0);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25, 25, 25, 25));

        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridPane.add(sceneTitle, 0, 0, 2, 1);
        gridPane.add(userName, 0, 1);
        gridPane.add(userNameTextField, 1, 1);
        gridPane.add(userPassword, 0, 2);
        gridPane.add(passwordField, 1, 2);
        gridPane.add(actionTarget, 1, 6);

        primaryStage.setScene(scene);

        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(button);
        gridPane.add(hBox, 1, 4);

        primaryStage.show();

        button.setOnAction(event -> {
            boolean loggedIn = new LoginViewController(this).logUserIn(userNameTextField, passwordField);
            if (loggedIn) {
                Start.start();
                primaryStage.hide();
            }
        });
    }

    TextField getUserNameTextField() {
        return userNameTextField;
    }

    PasswordField getPasswordField() {
        return passwordField;
    }

    Text getActionTarget() {
        return actionTarget;
    }
}