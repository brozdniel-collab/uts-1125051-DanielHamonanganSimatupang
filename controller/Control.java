package controller;
import java.util.ArrayList;
import java.util.List;
import model.MenuItem;
import util.InputUtil;

public class Control {
    private List<MenuItem> menu = new ArrayList<>();

    public String MasukID(){
        return InputUtil.inputString("");
    }

}
