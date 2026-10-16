package controller;
import java.util.ArrayList;
import java.util.List;
import model.EnumUkuran;
import model.MenuItem;
import model.Teh;
import util.InputUtil;

public class Control {
    private List<MenuItem> menu = new ArrayList<>();
    EnumUkuran ukur;

    public String MasukID(){
        return InputUtil.inputString();
    }

    public String MasukNamaMenu(){
        return InputUtil.inputString();
    }

    public int MasukHargaBase(){
        return InputUtil.inputInt();
    }

    public int MasukStock(){
        return InputUtil.inputInt();
    }

    public boolean MasukUkuran(){
        int a = InputUtil.inputInt();

        if(a == 1){
            ukur = EnumUkuran.SMALL;
            return true;
        }else{
            if(a == 2){
                ukur = EnumUkuran.MEDIUM;
            }else{
                ukur = EnumUkuran.LARGE;
            }
        return true;
        }
    }
    public void MasukkanData(int a , String id, String nama , int Base , int stock){
        switch (a) {
            case 2:
                Teh te = new Teh(id, nama, Base, stock);
                menu.add(te);
                tampilanMenuawal();
                break;
            default:
                throw new AssertionError();
        }
    }
    public void tampilanMenuawal(){
        for(MenuItem a1 : menu){
            System.out.println(a1.getOrderDetail());
        }
    }
}
