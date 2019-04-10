package JV2_Session3;

public class RunThread implements Runnable{

    public void run(){
        for (int i=1;i<10;i+=2){
            try {
                System.out.println(Thread.currentThread()
                        .getName()+" : "+i);
                Thread.sleep(1000);
            }catch (Exception e){}

        }
    }
}
