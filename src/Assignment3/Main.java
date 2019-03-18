package Assignment3;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

            TamGiacDeu tamGiacDeu = new TamGiacDeu();
            tamGiacDeu.chuvi();
            tamGiacDeu.loaiTamGiac = "Deu";
            tamGiacDeu.TinhDienTich("hello",5);

           ArrayList arrayList = new ArrayList();

           arrayList.add(new TamGiac());
           arrayList.add(new TamGiac());
           arrayList.add(new HinhChuNhat());
           arrayList.add(new TamGiac());

           for (int i=0;i<arrayList.size();i++){
               if(arrayList.get(i) instanceof TamGiac){
                   TamGiac tg = (TamGiac)arrayList.get(i);
                   tg.chuvi();
               }else if(arrayList.get(i) instanceof HinhChuNhat){
                   HinhChuNhat hcn = (HinhChuNhat)arrayList.get(i);
                   hcn.chuvi();
               }
           }


           ArrayList arr = new ArrayList();

           arr.add("hello");
           arr.add(1);
           arr.add(3.14156);

           arr.add(1,"world");

           ArrayList arr2 = new ArrayList();
           arr2.addAll(arr);
           arr2.addAll(2,arr);
           Fraction fraction1 = new Fraction(1,5);
           arr.add(fraction1);

           arr2.add(arr);

           for (int i=0;i< arr2.size();i++){
               System.out.println(arr2.get(i));
           }

           ArrayList<String> stringArray = new ArrayList<>();

           ArrayList<Fraction> frArray = new ArrayList<>();
            frArray.add(new Fraction(1,2));
            frArray.add(new Fraction(2,3));
            frArray.add(new Fraction(3,4));

            for(int i=0;i<frArray.size();i++){
                frArray.get(i).inPhanSo();
            }

            for(Fraction fr:frArray){
                fr.inPhanSo();
            }

//
//        Fraction fraction1 = new Fraction();
//        fraction1.nhapPhanSo();
//        Fraction fraction2 = new Fraction(3,4);
//        fraction1.add(fraction2);
//        fraction1.sub(fraction2);
//        fraction1.mul(fraction2);
//        fraction1.div(fraction2);
    }





}
