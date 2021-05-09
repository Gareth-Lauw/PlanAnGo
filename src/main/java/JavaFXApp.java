import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class JavaFXApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    public void start2(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("OPT2 navigation example");
        primaryStage.show();
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("MainMenuReal.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Mother of jesus");
        primaryStage.show();
    }
}
