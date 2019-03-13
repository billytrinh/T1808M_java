package Lab_Session3;

public class SoNguyenTo {
    int a = 2;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int x){
        this.setA(x);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(this.isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println(a+" Khong phai so nguyen to.");
        }
    }

    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        if(x == 2) return true;

        for (int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public int timSoNguyenToTiepTheo(){
        for (int i = this.getA()+1;true;i++){
            if(this.isSoNguyenTo(i)){
                this.setA(i);
                break;
            }
        }
        return this.getA();
    }
}
