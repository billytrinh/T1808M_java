package Assignment3;

public class Main {
    public static void main(String args[]){
        Fraction fraction1 = new Fraction();
        fraction1.nhapPhanSo();
        Fraction fraction2 = new Fraction(3,4);
        fraction1.add(fraction2);
        fraction1.sub(fraction2);
        fraction1.mul(fraction2);
        fraction1.div(fraction2);
    }
}
