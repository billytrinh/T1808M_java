package JV2_Session1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String args[]){
        //System.out.println("Hello world");
        double x = Math.random();
        LocalDate localDate = LocalDate.now();


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("world");
        Iterator<String> str = stringArrayList.iterator();
//        if(str.hasNext()){
//            System.out.println(str.next());
//        }
        while (str.hasNext()){
            System.out.println(str.next());
        }

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("abc");
        stringHashSet.add("bcd");
        stringHashSet.add("abc");
        for (String s:stringHashSet){
            System.out.println(s);
        }

        HashMap<String,String> stringHashMap = new HashMap<>();

        stringHashMap.put("name","nguyen van A");
        stringHashMap.put("age","18");

        System.out.println(stringHashMap.get("name"));
        System.out.println(stringHashMap.get("age"));

    }

    public String toString(){
        return "";
    }
}
