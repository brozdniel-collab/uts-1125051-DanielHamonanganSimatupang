package model;
import model.MenuItem;
import model.EnumUkuran;
import model.Customizable;

public class Teh extends MenuItem implements Customizable{
    
    public Teh(int id , String nama , int hargaBase , int stok){
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
