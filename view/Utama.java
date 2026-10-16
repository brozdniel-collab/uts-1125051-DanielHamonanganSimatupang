package view;
import controller.Control;

public class Utama {
    public static void main(String[] args) {
        Control control = new Control();
        boolean selesai = false;

        while(!selesai){
            System.out.println("Pilih Menu Dimasukkan :");
            System.out.println("(1)Kopi \n(2)Teh \n(3)Roti");
            int choice = control.MasukStock(); //Yang penting si method return INT :)

            switch (choice) {
                case 2:
                    System.out.println("Masukkan ID Teh : ");
                    String idteh = control.MasukID();

                    System.out.println("Masukkan Nama Teh : ");
                    String namateh = control.MasukNamaMenu();

                    System.out.println("Masukkan hargaBase Teh : ");
                    int baseteh = control.MasukHargaBase();

                    System.out.println("Masukkan stock Teh : ");
                    int stock = control.MasukStock();

                    System.out.println("Masukkan Ukuran Teh : ( (1)Small (2)Medium (3)Large");
                    control.MasukUkuran();

                    control.MasukkanData(choice, idteh, namateh, baseteh, stock);
                    break;
                default:
                    throw new AssertionError();
            }

        }


    }
}
