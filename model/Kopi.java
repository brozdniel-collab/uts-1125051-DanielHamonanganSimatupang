package model;

import java.util.List;

public abstract class Kopi extends MenuItem implements Customizable{
    private String kodePromo1 = "KOPI1";

    private int rum;
    private int es;
    private int gula;
    private int karamel;

    public Kopi(String id , String nama , int hargaBase , int stok){
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
    public void customize(List<Integer> custom) {

        rum = custom.get(0);
        es = custom.get(1);
        gula = custom.get(2);
        karamel = custom.get(3);
    }

    @Override
    public void customize(int[] custom) {

        rum = custom[0];
        es = custom[1];
        gula = custom[2];
        karamel = custom[3];
    }

    @Override 
    public String getOrderDetail(){
        return "ID: "+getId()+" -Nama: "+getNama()+" -hargaBase : "+getHargaBase()+" -Stock :"+getStock();
    }
}
