package JV2_Session4;

public class Main {
    public static void main(String args[]){
        Number number = new Number();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                   // synchronized (number){
                        number.up();
                        number.show();
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){}
                  //  }
                }

            }
        } ;
        Thread t1 = new Thread(r1);
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                   // synchronized (number){
                        number.up();
                        number.show();
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){}
                   // }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                   // synchronized (number){
                        number.up();
                        number.show();
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){}
                   // }
                }
            }
        }).start();

    }
}
