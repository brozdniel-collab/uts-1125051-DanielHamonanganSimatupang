package model;

public class Teh extends MenuItem{
    
    public Teh(String id , String nama , int hargaBase , int stok){
        super(id, nama, stok, hargaBase);
    }

    @Override
    public double hitungHargaTotal(){
        return 0.1;
    }

    @Override 
    public String getOrderDetail(){
        return "";
    }
}
