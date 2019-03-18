package Assignment4;

public class Ao extends ThoiTrang{
    public Integer size;
    public  String color;

    public Ao(Integer ID, String name, Double price, Integer qty,
              String brand,Integer size,String color){
        super(ID,name,price,qty,brand);
        this.size = size;
        this.color = color;
    }

}
