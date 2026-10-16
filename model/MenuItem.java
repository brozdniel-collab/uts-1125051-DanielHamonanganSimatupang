package model;


public abstract class MenuItem {
    private String id;
    private String nama;
    private int stock;
    private int hargaBase;

    public MenuItem(String id , String nama , int stock , int hargabase){
        this.id = id;
        this.nama = nama;
        this.stock = stock;
        this.hargaBase = hargabase;
    }
    
    abstract double hitungHargaTotal();
    abstract public String getOrderDetail();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHargaBase() {
        return hargaBase;
    }

    public void setHargaBase(int hargaBase) {
        this.hargaBase = hargaBase;
    }


}
