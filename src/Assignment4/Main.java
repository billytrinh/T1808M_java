package Assignment4;

public class Main {

    public static void main(String args[]){
        SanPham sanPham1 = new SanPham(1,"San pham 1",1000.0,5);
        SanPham sanPham2 = new SanPham(2,"San pham 2",2000.0,2);
        SanPham sanPham3 = new SanPham(3,"San pham 3",5000.0,0);

        DonHang donHang1 = new DonHang(1);
        donHang1.themSanPham(sanPham1);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham3,80);

        donHang1.inDonHang();


        DonHang donHang2 = new DonHang(2);
        donHang2.themSanPham(sanPham2,90);

        donHang2.inDonHang();
    }

}
