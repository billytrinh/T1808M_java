package Assignment4;

public class SanPham {

    public Integer ID;
    public String name;
    public Double price;
    public Integer qty;

    public SanPham() {
    }

    public SanPham(Integer ID, String name, Double price, Integer qty) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }


}
