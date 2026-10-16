package model;

public abstract class  Roti extends MenuItem {
    String kodePromo1 = "ROTI1";

    public Roti(String id , String nama , int hargaBase , int stok){
        super(id, nama, stok, hargaBase);
    }

    public double hitungHargaTotal(int jumlah){
        return jumlah * getHargaBase();
    }
    public double hitungHargaTotal(int jumlah, String kodePromo){
        double promo;
        if(kodePromo1 == kodePromo){
            return 0.2 * hitungHargaTotal(jumlah);
        }
        return hitungHargaTotal(jumlah);
    }
    public double hitungHargaTotal(int jumlah, EnumUkuran ukuran){
        if(ukuran == EnumUkuran.SMALL){
            return 2000 + hitungHargaTotal(jumlah);
        }else{
            if(ukuran == EnumUkuran.MEDIUM){
                return 5000 + hitungHargaTotal(jumlah);
            }else{
                if(ukuran == EnumUkuran.LARGE){
                    return 10000 + hitungHargaTotal(jumlah);
                }
            }
        return 0;
        }
    }
    @Override 
    public String getOrderDetail(){
        return "ID: "+getId()+" -Nama: "+getNama()+" -hargaBase : "+getHargaBase()+" -Stock :"+getStock();
    }
}
