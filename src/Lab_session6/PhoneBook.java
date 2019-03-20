package Lab_session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{

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
