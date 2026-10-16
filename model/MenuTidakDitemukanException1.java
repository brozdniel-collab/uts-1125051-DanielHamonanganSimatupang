package model;

public class MenuTidakDitemukanException1 extends MenuTidakDitemukanException{

    public MenuTidakDitemukanException1() {
        super("Tidak ada menu");
    }
    
}

class MenuTidakDitemukanException extends Exception{
    public MenuTidakDitemukanException(String message) {
        super(message);
    }

}