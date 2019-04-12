package JV2_Session4;

public class Number {
    public int x = 0;
    public int y = 0;
    public int z=0;

    public synchronized void up(){
        x++;
        y++;
    }

    public  void show(){
        show2();
        System.out.println("z= "+z);
    }

    public synchronized void show2(){
        System.out.println(Thread.currentThread()
                .getName());
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }

    public int getZ() {
        return z;
    }
}
