package Lab_session6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

    static class StaticPhone{
        public void run(){
            System.out.println("running..");
        }
    }

    class InnerPhone{
        public void running(){
            System.out.println("InnerPhone running..");
        }
    }

    public static void main(String args[]) throws ArithmeticException{
        //PhoneBook.StaticPhone staticPhone = new PhoneBook.StaticPhone();

        //PhoneBook.InnerPhone innerPhone = new PhoneBook().new InnerPhone();

        int x =0,y=1;
        x++;

//        if(y <= 0) throw new ArithmeticException("Loi roi");
//        int z = x/y;
//        z++;
//        System.out.println("z = "+z);

        int z = 0;
        try {
            z = x/y;
            z++;
            System.out.println("z = "+z);
        }catch (ArithmeticException e){
            System.out.println("loi tinh toan");
       // }catch (SQLException e){

        //}catch (IOException e){

        //}catch (FileNotFoundException e){

        }catch (Exception e){
            System.out.println("Loi roi");
        }finally {
           if(z == 0){
                z = 1;
           }
        }

        System.out.println("Done z = "+z );


    }

    public ArrayList<PhoneNumber> PhoneList;

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber PN:this.PhoneList){
            if(PN.name.equals(name)){
                if(PN.phone.equals(phone)){
                    System.out.println("SDT da co");
                    return;
                }
                PN.phone += ":"+phone;
                System.out.println("da noi thanh 2 so");
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,phone));
        System.out.println("them thanh cong");
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber PN:this.PhoneList){
            if(PN.name.equals(name)){
                this.PhoneList.remove(PN);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber PN:this.PhoneList){
            if(PN.name.equals(name)){
                PN.phone = newphone;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber PN:this.PhoneList){
            if(PN.name.equals(name)){
                System.out.println(PN.name+" -- "+PN.phone);
            }
        }
    }

    @Override
    public void sort(){
        Collections.sort(this.PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public void sort2() {
        for(int i=0;i<this.PhoneList.size();i++){
            for (int j=0;j<this.PhoneList.size()-i-1;j++){
                if(this.PhoneList.get(j).name.compareTo(this.PhoneList.get(j+1).name) < 0){
                    PhoneNumber PN =  this.PhoneList.get(j+1);
                    this.PhoneList.add(j,PN);
                    this.PhoneList.remove(j+2);
                }
            }
        }
    }
}
