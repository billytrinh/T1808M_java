package JV2_Labsession4;

public class SoNguyenTo {
    Integer snt = 2;

    public void printSNT(){
        if(kiemtra(snt)){
            System.out.println("SNT: "+snt);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        snt++;
    }

    public boolean kiemtra(Integer n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }

}
