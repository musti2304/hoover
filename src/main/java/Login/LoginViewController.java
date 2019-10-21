package Login;

import Database.Connection;
import com.mongodb.client.model.Projections;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.bson.Document;


class LoginViewController {

    private LoginView loginView;
    private Connection databaseConnection;
    private Document documentUserName;
    private Document documentPassword;
    private boolean userIsAuthorized = false;

    LoginViewController(LoginView loginView) {
        this.loginView = loginView;
        databaseConnection = new Connection("localhost", 27017,
                "user", "users");
    }

    /**
     *
     * @param userNameTextField Username field
     * @param passwordField Password field
     * @return boolean
     */
    boolean logUserIn(TextField userNameTextField, PasswordField passwordField) {
        try {

            documentUserName = databaseConnection.getMongoCollection().find(new Document("username",
                    userNameTextField.getCharacters().toString())).projection(Projections.fields(Projections
                    .include("username"), Projections.excludeId())).first();

            documentPassword = databaseConnection.getMongoCollection().find(new Document("password",
                    passwordField.getCharacters().toString())).projection(Projections.fields(Projections
                    .include("password"), Projections.excludeId())).first();

            userIsAuthorized = authenticateUser(documentUserName.getString("username"),
                    documentPassword.getString("password"));
//            System.out.println(documentUserName.getString("username") + "\n"
//                    + documentPassword.getString("password"));

            if (userIsAuthorized) {
                loginView.getActionTarget().setText("User logged in");
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            loginView.getActionTarget().setText("Error. Please try again");
        }

        databaseConnection.getMongoClient().close();
        return userIsAuthorized;
    }

    /**
     *
     * @param userName username
     * @param password password
     * @return boolean
     */
    private boolean authenticateUser(String userName, String password) {
        return (userName.equals(getLoginView().getUserNameTextField().getCharacters().toString()))
                && (password.equals(getLoginView().getPasswordField().getCharacters().toString()));
    }

    private LoginView getLoginView() {
        return loginView;
    }

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public Document getDocumentUserName() {
        return documentUserName;
    }

    public Document getDocumentPassword() {
        return documentPassword;
    }
}