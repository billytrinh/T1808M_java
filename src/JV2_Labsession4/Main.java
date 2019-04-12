package JV2_Labsession4;

public class Main {
    public static void main2(String args[]){
        SoNguyenTo snt = new SoNguyenTo();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (snt){
                    for (int i =0;i<100;i++){
                        snt.printSNT();
                    }
                }
            }
        };
        new Thread(r1).start();
        new Thread(r1).start();
    }
}
