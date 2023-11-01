/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class PenggunaanAir {
    private String aktivitas;
    private int jumlah;
    private Date tanggal;

    public PenggunaanAir(String aktivitas, int jumlah) {
        this.aktivitas = aktivitas;
        this.jumlah = jumlah;
        this.tanggal = new Date(); // Tanggal default saat objek dibuat
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void tampilkanDetailPenggunaan() {
        System.out.println("Aktivitas: " + aktivitas);
        System.out.println("Jumlah: " + jumlah + " liter");
        System.out.println("Tanggal: " + new SimpleDateFormat("dd-MM-yyyy").format(tanggal));
    }

    @Override
    public String toString() {
        return "PenggunaanAir{" +
                "aktivitas='" + aktivitas + '\'' +
                ", jumlah=" + jumlah +
                ", tanggal=" + new SimpleDateFormat("dd-MM-yyyy").format(tanggal) +
                '}';
    }
}


