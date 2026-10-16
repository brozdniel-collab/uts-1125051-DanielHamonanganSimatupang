package view;
import controller.Control;

public class Utama {
    public static void main(String[] args) {
        Control control = new Control();
        boolean selesai = false;

        while(!selesai){
            System.out.println("Pilih Menu Dimasukkan :");
            System.out.println("(1)Kopi \n(2)Teh \n(3)Roti");
            int choice = 2;

            switch (choice) {
                case 2:
                    System.out.println("Masukkan ID Teh : ");
                    
                    System.out.println("Masukkan Nama Teh : ");

                    System.out.println("Masukkan hargaBase Teh : ");

                    System.out.println("Masukkan stock Teh : ");

                    System.out.println("Masukkan Ukuran Teh : ( (1)Small (2)Medium (3)Large");
                    
                    break;
                default:
                    throw new AssertionError();
            }

        }


    }
}
