/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private AuthManager auth;
    private Biodata biodata;
    private Poin poin;
    private List<PenggunaanAir> riwayatPenggunaan;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.auth = new AuthManager();
        this.riwayatPenggunaan = new ArrayList<>();
        this.poin = new Poin(0);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Biodata getBiodata() {
        return biodata;
    }

    public void setBiodata(Biodata biodata) {
        this.biodata = biodata;
    }

    public void inputPenggunaanAir(String aktivitas, int jumlah) {
        PenggunaanAir penggunaanAir = new PenggunaanAir(aktivitas, jumlah);
        riwayatPenggunaan.add(penggunaanAir);
        System.out.println("Penggunaan air berhasil dicatat.");
    }
    
    public int getTotalPenggunaanHariIni() {
        int totalPenggunaan = 0;

        // Menghitung total penggunaan air dari riwayat penggunaan hari ini
        for (PenggunaanAir penggunaanAir : riwayatPenggunaan) {
            totalPenggunaan += penggunaanAir.getJumlah();
        }

        return totalPenggunaan;
    }

    public void kalkulasiPoin() {
        int totalPenggunaan = 0;

        // Menghitung total penggunaan air dari riwayat penggunaan
        for (PenggunaanAir penggunaanAir : riwayatPenggunaan) {
            totalPenggunaan += penggunaanAir.getJumlah();
        }

        // Mendapatkan batas rata-rata penggunaan air harian
        int batasRataRata = 50; // Misalnya, batas rata-rata adalah 50 liter per hari

        // Menghitung selisih penggunaan air dengan batas rata-rata
        int selisih = totalPenggunaan - batasRataRata;

        // Menentukan poin berdasarkan selisih
        int poinBaru;
        if (selisih <= 0) {
            // Jika tidak melebihi batas rata-rata, tambahkan poin
            poinBaru = poin.getJumlahPoin() + 10;
            System.out.println("Selamat! Anda mendapatkan tambahan 10 poin.");
        } else {
            // Jika melebihi batas rata-rata, kurangi poin
            poinBaru = poin.getJumlahPoin() - (selisih * 2);
            System.out.println("Maaf, Anda melebihi batas rata-rata. Poin dikurangi sebanyak " + (selisih * 2));
        }

        // Mengupdate jumlah poin
        poin.tambahPoin(poinBaru - poin.getJumlahPoin());
    }

    public void tukarPoin(Reward reward) {
        if (poin.getJumlahPoin() >= reward.getHargaPoin()) {
            System.out.println("Poin cukup, berhasil menukar poin dengan reward: " + reward.getNama());
            poin.kurangiPoin(reward.getHargaPoin());
        } else {
            System.out.println("Poin tidak cukup untuk menukar reward: " + reward.getNama());
        }
    }

    public void tampilkanRiwayatPenggunaan() {
        System.out.println("Riwayat Penggunaan Air:");
        for (PenggunaanAir penggunaanAir : riwayatPenggunaan) {
            penggunaanAir.tampilkanDetailPenggunaan();
        }
        biodata.tampilkanBiodata();
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", biodata=" + biodata +
                ", poin=" + poin +
                ", riwayatPenggunaan=" + riwayatPenggunaan +
                '}';
    }
}

