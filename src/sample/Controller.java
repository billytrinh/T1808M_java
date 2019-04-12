package sample;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txt;
    public static Integer x = 0;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Thread t =new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer i=0;i<100;i++,x++){
                    try {
                        Runnable r = new Runnable() {
                            @Override
                            public void run() {
                                txt.setText(x.toString());
                            }
                        };
                        Platform.runLater(r);
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        t.setDaemon(true);
        t.start();

    }
}
