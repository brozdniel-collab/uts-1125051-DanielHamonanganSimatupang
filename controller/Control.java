package controller;

import model.MenuTidakDitemukanException1;
import model.StokTidakCukupException1;
import model.Roti;
import model.Kopi;
import model.Teh;
import model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Control {

    private final List<MenuItem> daftarMenu;

    public Control() {

        daftarMenu = new ArrayList<>();

        daftarMenu.add(new Kopi("M-01","Kopi Susu",15000, 5));

        daftarMenu.add(new Teh("M-02", "Teh Tarik",12000,10));

        daftarMenu.add(new Roti("M-03","Roti Cokelat",10000,8));
    }

    public void tampilanMenuawal() {

        System.out.println("=== MENU ===");

        for (MenuItem item : daftarMenu) {
            System.out.println(
                    item.getId() + " | " +
                    item.getNama() + " | Stok : " +
                    item.getStock());
        }
    }

    public MenuItem cariMenu(String id)
            throws MenuTidakDitemukanException1 {

        for (MenuItem item : daftarMenu) {
            if (item.getId().equalsIgnoreCase(id)) {
                return item;
            }
        }

        throw new MenuTidakDitemukanException1("Menu tidak ditemukan!");
    }

    public void validasiPesanan(
            MenuItem item,
            int jumlah)
            throws StokTidakCukupException1 {


        if (jumlah > item.getStok()) {
            throw new StokTidakCukupException1("Stok tidak cukup!");
        }
    }
}