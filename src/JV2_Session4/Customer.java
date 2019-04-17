package JV2_Session4;

public class Customer {
    public int money = 10000;

    public synchronized void rutTien(int n){
        if(n > money){
            System.out.println("khong the rut so tien: "+n);
            try {
                System.out.println("Cho bo nap tien....");
                wait();
            }catch (Exception e){}
        }
        System.out.println("Da rut so tien: "+n);
        money -= n;
    }

    public synchronized void napTien(int n){
        money+= n;
        System.out.println("Nap thanh cong so tien: "+n);
        try {
            notify();
            //notifyAll();
        }catch (Exception e){}
    }

    public static void main(String args[]){
        Customer customer = new Customer();

        new Thread(new Runnable() {
            @Override
            public void run() {
                customer.rutTien(20000);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                customer.napTien(40000);
            }
        }).start();

    }
}
