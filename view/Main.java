import controller.Control;
import model.MenuTidakDitemukanException1;
import model.StokTidakCukupException1;
import model.MenuItem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Control controller = new Control();

        try {

            controller.tampilanMenuawal();

            System.out.print(
                    "\nMasukkan ID Menu : ");
            String id = input.nextLine();

            MenuItem item =controller.cariMenu(id);

            System.out.print(
                    "Jumlah Pesanan : ");
            int jumlah =
                    input.nextInt();

            controller.validasiPesanan(
                    item,
                    jumlah);

            if (item instanceof Kopi kopi) {

                int[] custom = new int[4];

                System.out.print("Rum : ");
                custom[0] = input.nextInt();

                System.out.print("Es : ");
                custom[1] = input.nextInt();

                System.out.print("Gula : ");
                custom[2] = input.nextInt();

                System.out.print("Karamel : ");
                custom[3] = input.nextInt();

                kopi.customize(custom);
            }

            else if (item instanceof Teh teh) {

                int[] custom = new int[4];

                System.out.print("Boba : ");
                custom[0] = input.nextInt();

                System.out.print("Es : ");
                custom[1] = input.nextInt();

                System.out.print("Gula : ");
                custom[2] = input.nextInt();

                System.out.print("Karamel : ");
                custom[3] = input.nextInt();

                teh.customize(custom);
            }

            else if (item instanceof Roti roti) {

                int[] custom = new int[3];

                System.out.print("Gula : ");
                custom[0] = input.nextInt();

                System.out.print("Meses : ");
                custom[1] = input.nextInt();

                System.out.print("Karamel : ");
                custom[2] = input.nextInt();

                roti.customize(custom);
            }

            double total =item.hitungHargaTotal(jumlah,EnumUkuran.MEDIUM);

            item.kurangiStok(jumlah);

            System.out.println("\n===== STRUK =====");
            System.out.println(
                    item.getOrderDetail());

            System.out.println(
                    "Total : Rp " + total);

        }

        catch (MenuTidakDitemukanException1 |StokTidakCukupException1 e) {

            System.out.println("Error : " +e.getMessage());
        }
    }
}

// OK