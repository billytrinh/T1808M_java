package sample;

import javafx.scene.control.TextArea;

import java.util.HashSet;

public class Controller {

    public TextArea textArea;

    public void Submit(){
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i=0;integerHashSet.size()<10;i++){
            double number = Math.random();
            number = number*100;
            Integer x = (int)number;
            integerHashSet.add(x);
        }
        String result = "";
        for (Integer x:integerHashSet){
            result += x+"\n";
        }
        textArea.setText(result);
    }

}
