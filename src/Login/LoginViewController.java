package Login;

import Database.DatabaseConnection;
import com.mongodb.client.model.Projections;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.bson.Document;


class LoginViewController {

    private LoginView loginView;
    private DatabaseConnection databaseConnection;
    private Document documentUserName;
    private Document documentPassword;

    LoginViewController(LoginView loginView) {
        this.loginView = loginView;
        databaseConnection = new DatabaseConnection("localhost", 27017,
                "user", "users");
    }

    void logUserIn(TextField userNameTextField, PasswordField passwordField) {
        try {

            documentUserName = databaseConnection.getMongoCollection().find(new Document("username",
                    userNameTextField.getCharacters().toString())).projection(Projections.fields(Projections
                    .include("username"), Projections.excludeId())).first();

            documentPassword = databaseConnection.getMongoCollection().find(new Document("password",
                    passwordField.getCharacters().toString())).projection(Projections.fields(Projections
                    .include("password"), Projections.excludeId())).first();

            System.out.println(documentUserName.getString("username") + "\n"
                    + documentPassword.getString("password"));

            loginView.getActionTarget().setText("User logged in");

        } catch (NullPointerException e) {
            e.printStackTrace();
            loginView.getActionTarget().setText("Error. Please try again");

        } finally {
            authenticateUser(documentUserName.getString("username"), documentPassword.getString("password"));
        }

        databaseConnection.getMongoClient().close();
    }

    private boolean authenticateUser(String userName, String password) {
        return (userName.equals(getLoginView().getUserNameTextField().getCharacters().toString()))
                && (password.equals(getLoginView().getPasswordField().getCharacters().toString()));
    }

    private LoginView getLoginView() {
        return loginView;
    }

    public DatabaseConnection getDatabaseConnection() {
        return databaseConnection;
    }

    public Document getDocumentUserName() {
        return documentUserName;
    }

    public Document getDocumentPassword() {
        return documentPassword;
    }
}