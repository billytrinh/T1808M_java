package Lab_Session3;

public class Main {

    public static void main(String args[]){
        SoNguyenTo soNguyenTo = new SoNguyenTo(4);
        for (int i=0;i<20;i++){
            System.out.println("SNT tiep: "+
                    soNguyenTo.timSoNguyenToTiepTheo());
        }
    }

}
