package Lab_session2;

public class Main {

    public static void main(String[] args){
        Nhanvien nhanvien1 = new Nhanvien();
        //nhanvien1.inputInfo();
       // nhanvien1.printInfo();

        Nhanvien nhanvien2 = new Nhanvien(nhanvien1.getName(),nhanvien1.age,nhanvien1.address
                ,nhanvien1.salary,nhanvien1.workingTime);
    }

}
