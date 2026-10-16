package model;


public class StokTidakCukupException1 extends StokTidakCukupException{

    public StokTidakCukupException1() {
        super("Stock ga cukup");
    }
    
}
class StokTidakCukupException extends Exception {
    public StokTidakCukupException(String message) {
        super(message);
    }

}
