package UI;

import Login.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sun.rmi.runtime.Log;

public class UIView extends Application {

    private LoginView loginView;

    public UIView (LoginView loginView) {
        this.loginView = loginView;

    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene addDataScene = new Scene(loginView.getGridPane());

    }

    public LoginView getLoginView() { return this.loginView; }
}
