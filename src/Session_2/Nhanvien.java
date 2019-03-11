package Session_2;

public class Nhanvien {

    private String name;
    private int age;

    static String message = "hello";

    void showName(){
        System.out.println("ten nhan vien: "+name);
    }

    static void sayHello(){
        System.out.println("Hello ....");
       // name = "abc aaa";
        message = "hello world";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
