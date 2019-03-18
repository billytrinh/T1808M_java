package Assignment4;

import java.util.ArrayList;

public class DonHang {

    public Integer ID;
    public Double tongTien;
    public ArrayList<SanPham> dsSanPham;

    public DonHang(Integer ID){
        this.ID = ID;
        this.tongTien = 0.0;
        this.dsSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPhamX,int sale){
        if(sanPhamX.getQty() <= 0){
            System.out.println("San pham "+sanPhamX.getName()+" het hang");
            return;
        }

        if(sale < 0) sale = 0;
        if(sale>100) sale = 100;

        this.tongTien = this.tongTien + (100-sale)*sanPhamX.getPrice()/100 ;

        //sanPhamX.setQty(sanPhamX.getQty() -1);
        int tmp = sanPhamX.getQty() - 1;
        sanPhamX.setQty(tmp);

        this.dsSanPham.add(sanPhamX);
        System.out.println("Da them san pham "+sanPhamX.getName()+" vao don hang");
    }

    public void themSanPham(SanPham sanPhamX){
        if(sanPhamX.getQty() <= 0){
            System.out.println("San pham "+sanPhamX.getName()+" het hang");
            return;
        }
        this.tongTien += sanPhamX.getPrice();

        //sanPhamX.setQty(sanPhamX.getQty() -1);
        int tmp = sanPhamX.getQty() - 1;
        sanPhamX.setQty(tmp);

        this.dsSanPham.add(sanPhamX);
        System.out.println("Da them san pham "+sanPhamX.getName()+" vao don hang");
    }

    public void inDonHang(){
        System.out.println("Tong tien: "+this.tongTien);
    }

}
