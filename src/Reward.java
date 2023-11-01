/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
public class Reward {
    private String nama;
    private int hargaPoin;

    public Reward(String nama, int hargaPoin) {
        this.nama = nama;
        this.hargaPoin = hargaPoin;
    }

    public String getNama() {
        return nama;
    }

    public int getHargaPoin() {
        return hargaPoin;
    }

    public void tampilkanDetailReward() {
        System.out.println("Nama Reward: " + nama);
        System.out.println("Harga Poin: " + hargaPoin);
    }

    @Override
    public String toString() {
        return "Reward{" +
                "nama='" + nama + '\'' +
                ", hargaPoin=" + hargaPoin +
                '}';
    }
}


