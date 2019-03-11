package Session_2;

public class Main {

    public static void main(String[] args){

        Nhanvien x = new Nhanvien();
        x.setName("le van a");
        x.setAge(22);
        x.showName();
        System.out.println(x.getName());
        Nhanvien.sayHello();
    }
}
