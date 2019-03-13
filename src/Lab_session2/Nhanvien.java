package Lab_session2;

import java.util.Scanner;

public class Nhanvien {

    public String name;
    public int age;
    public String address;
    public double salary;
    public int workingTime;

    public Nhanvien() {
    }

    public Nhanvien(String name, int age, String address, double salary, int workingTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workingTime = workingTime;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public void inputInfo(){
        System.out.println("Nhap ten nhan vien:");
        Scanner scanner = new Scanner(System.in);
        this.setName(scanner.nextLine());

        System.out.println("nhap tuoi:");

        this.setAge(scanner.hasNextInt()?scanner.nextInt():18);

        scanner.nextLine();

        System.out.println("nhap dia chi:");
        address = scanner.nextLine();

        System.out.println("nhap tien luong:");
        salary =  scanner.nextDouble();

        System.out.println("nhap thoi gian lam:");
        workingTime = scanner.nextInt();
    }

    public void printInfo(){
        System.out.println("Thong tin nhan vien:");
        System.out.println(this.getName()+" - tuoi:"+age);
    }

    public double tinhThuong(){
        double thuong = 0;
        if(workingTime >= 200){
            thuong = salary*20/100;
        }else if(workingTime < 200 && workingTime>=100){
            thuong = salary*10/100;
        }
        return  thuong;
    }

}
