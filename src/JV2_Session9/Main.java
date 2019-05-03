package JV2_Session9;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(localDateTime1);

        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);

        ResourceBundle resourceBundle = ResourceBundle
                .getBundle("JV2_Session9.Message");

        System.out.println(resourceBundle.getString("hello"));

        ResourceBundle rb = ResourceBundle.getBundle("JV2_Session9.Message",Locale.US);
        System.out.println(rb.getString("hello"));

        double money = 12000;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Money: "+numberFormat.format(money));

        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Money: "+numberFormat2.format(money));

        String mn = numberFormat.format(money);

        NumberFormat nF = NumberFormat.getNumberInstance();
        System.out.println(nF.format(money));
    }
}
