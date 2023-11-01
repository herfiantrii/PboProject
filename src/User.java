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

    public void kalkulasiPoin() {
        // Implementasi kalkulasiPoin
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

