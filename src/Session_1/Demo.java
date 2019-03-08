package Session_1;

import java.util.Scanner;

public class Demo {

    int y = 10; // Instance variable

    static int z = 20; // Class variable

    final static int k = 20; // Const

    public static void main(String[] args){
        int x = 10;
        System.out.println("Hello world.");
        Demo obj = new Demo();
        x = x+ obj.y;
        // x = x+y;  --> error
        x = x+ Demo.z;
        Demo.z = 30;
        x = x + Demo.k;
        //Demo.k = 50;
        x = x > 50?100:50;

        int[] arr = {1,2,3};

        for (int i=0;i<3;i++){
            System.out.println(arr[i]);
        }

        for (int i:arr) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so tu ban phim:");
        int input = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap 1 so tu ban phim:");
        String txt = scanner.nextLine();

        System.out.println("So vua nhap "+input+" chuoi vua nhap: "+txt);

    }

}
