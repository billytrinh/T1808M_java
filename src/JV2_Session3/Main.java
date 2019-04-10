package JV2_Session3;

public class Main {
    public static String str = "Hello";
    public static void main(String args[]) throws Exception{

        SubThread s1 = new SubThread();
        s1.setName("Sub thread ABC");
      //  s1.run();
        s1.start();

        RunThread r1 = new RunThread();
        Thread thread = new Thread(r1);
        thread.start();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<100;i+=2){
                    try {
                        System.out.println("DAEMON: "+i);
                        Thread.sleep(1000);
                    }catch (Exception e){}

                }
            }
        };
        Thread t2 = new Thread(r2);
        t2.setDaemon(true);
        if(t2.isDaemon()){
            t2.setDaemon(false);
        }
        t2.start();

        System.out.println("Main thread - name:"+
                Thread.currentThread().getName());
    }

}
