package Session_7;

import java.time.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArrayList<String> strArr = new ArrayList();
        strArr.add("hello");
        strArr.add("bca");
        strArr.add("abc");
        strArr.add("cab");
        strArr.add("aaa");

        strArr.stream()
                .sorted()
                .filter(s -> s.startsWith("a"))
                .map(s -> {s=s+"bbb";return s;})
                .forEach(x->System.out.println(x));

        System.out.println("--------------");

        for (String x:strArr){
            System.out.println(x);
        }
    }

    public static void main2(String args[]){
        LocalDate  localDate = LocalDate.now();
        System.out.println("Today: "+localDate);

        System.out.println("Next day: "+localDate.plusDays(1));
        System.out.println("Last day: "+localDate.minusDays(1));
        System.out.println("Next month: "+localDate.plusMonths(1));

        LocalDate birthday = LocalDate.of(1999,2,28);
        System.out.println("Birthday: "+birthday);

        LocalDate date = LocalDate.parse("1999-02-27");
        System.out.println("Date: "+date);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now: "+localDateTime);
        System.out.println("Time: "+ localDateTime.getHour());

        LocalDateTime timer = LocalDateTime.of(1999,12,11,
                4,30,23,0);

        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zoned);

//        UInterface uInterface = new UInterface() {
//            @Override
//            public void running() {
//                System.out.println("Running...");
//            }
//        };

        //uInterface.running();

        UInterface ui = (int a,int b)->{
            System.out.println("UI run.."+ (a+b));
        };
        ui.running(2,3);

        X xObj = new X();
        xObj.a().b().c();

        LocalDate localDate1 = LocalDate.now();
        localDate1.plusMonths(1).plusDays(1);

//        LocalDate c20 = LocalDate.of(1901,2,28);
//        if(c20.plusDays(1).getDayOfYear() == 29){
//            int year = 1900;
//            for (int i=0;year<2001;i+=4){
//                year = c20.plusYears(i).plusDays(1).getYear();
//                System.out.println(year);
//            }
//        }
        LocalDate c20 = LocalDate.of(1901,2,28);
        while (c20.plusDays(1).getDayOfMonth() != 29){
            c20 = c20.plusYears(1);
        }

        int year = c20.getYear();
        for (int i=0;year<2001;i+=4){
            year = c20.plusYears(i).getYear();
            System.out.println(year);
        }


    }
}
