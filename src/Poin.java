/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
public class Poin {
    private int jumlahPoin;

    public Poin(int jumlahPoin) {
        this.jumlahPoin = jumlahPoin;
    }

    public int getJumlahPoin() {
        return jumlahPoin;
    }

    public void tambahPoin(int jumlah) {
        jumlahPoin += jumlah;
        System.out.println("Poin ditambahkan: " + jumlah);
    }

    public void kurangiPoin(int jumlah) {
        if (jumlah <= jumlahPoin) {
            jumlahPoin -= jumlah;
            System.out.println("Poin dikurangi: " + jumlah);
        } else {
            System.out.println("Poin tidak cukup untuk dikurangi.");
        }
    }

    @Override
    public String toString() {
        return "Poin{" +
                "jumlahPoin=" + jumlahPoin +
                '}';
    }
}

