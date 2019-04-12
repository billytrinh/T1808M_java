package JV2_Labsession4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UIFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("uifx.fxml"));
        primaryStage.setTitle("Tim so nguyen to");
        primaryStage.setScene(new Scene(root, 320, 200));
        primaryStage.show();
    }
}
