package JV2_Labsession4;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField txt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SoNguyenTo snt = new SoNguyenTo();
        System.out.println(Thread.currentThread().getName());
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (snt){
                    for (int i =0;i<100;i++){
                        if(snt.kiemtra(snt.snt)){
                            // in ra giao dien FX
                            Runnable runnable = new Runnable() {
                                @Override
                                public void run() {
                                    txt.setText(snt.snt.toString());
                                }
                            };
                            Platform.runLater(runnable);
                            try {
                                Thread.sleep(1000);
                            }catch (Exception e){}
                        }
                        snt.snt++;
                    }
                }
            }
        };
        new Thread(r1).start();
    }
}
