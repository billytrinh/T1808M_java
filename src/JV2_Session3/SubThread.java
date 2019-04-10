package JV2_Session3;

public class SubThread extends Thread{

    public void run(){
        for (int i=0;i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" : "+i);
                Thread.sleep(1000);
            }catch (Exception e){}

        }
    }

}
