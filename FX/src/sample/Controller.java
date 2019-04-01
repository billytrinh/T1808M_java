package sample;


import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    public TextField from;
    public TextField to;
    public TextArea result;

    public void Submit(){
        try {
            Integer x = Integer.parseInt(from.getText());
            Integer y = Integer.parseInt(to.getText());

            ArrayList<Integer> sntArray = new ArrayList<>();
            for (int i=x;i<=y;i++){
                if(checkSNT(i)){
                    sntArray.add(i);
                }
            }
            String str = "Danh sach so nguyen to: \n";
            int line = 0;
            for (Integer i:sntArray){
                str+= (i+" ");
                if((str.length()-26 - line*50) >= 50){
                    str+= "\n";
                    line++;
                }
            }

            result.setText(str);
        }catch (Exception e){
            result.setText("Nhap thong tin khong dung");
        }

    }

    public static boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return  true;
    }

}
