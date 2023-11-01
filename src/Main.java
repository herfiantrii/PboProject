/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek AuthManager
        AuthManager authManager = new AuthManager();

        // Register dan login user
        User user1 = authManager.register("user1", "password123");
        User user2 = authManager.register("user2", "qwerty");

        authManager.login("user1", "password123");

        // Mengisi biodata
        Biodata biodataUser1 = new Biodata("John Doe", "john@example.com", parseDate("01-01-1990"), "Laki-Laki", "081234567890");
        authManager.inputBiodata(user1, biodataUser1);

        // Membuat objek PenggunaanAir
        PenggunaanAir penggunaanMandi = new PenggunaanAir("Mandi", 10);

        // Menambahkan penggunaan air ke riwayat user
        user1.inputPenggunaanAir(penggunaanMandi.getAktivitas(), penggunaanMandi.getJumlah());

        // Menampilkan detail penggunaan air
        penggunaanMandi.tampilkanDetailPenggunaan();

        // Membuat objek Poin
        Poin poinUser1 = new Poin(100);

        // Menambahkan dan mengurangi poin
        poinUser1.tambahPoin(50);
        poinUser1.kurangiPoin(30);

        // Menampilkan jumlah poin
        System.out.println("Jumlah Poin User1: " + poinUser1.getJumlahPoin());

        // Membuat objek StatistikPenggunaan
        StatistikPenggunaan statistikUser1 = new StatistikPenggunaan();

        // Mencatat penggunaan air
        statistikUser1.catatPenggunaan("Mandi", 10);
        statistikUser1.catatPenggunaan("Cuci Tangan", 5);

        // Menampilkan statistik penggunaan air
        statistikUser1.tampilkanStatistik();

        // Membuat objek RewardManager
        RewardManager rewardManager = new RewardManager();

        // Membuat objek Reward
        Reward reward1 = new Reward("Diskon belanja", 50);

        // Menambahkan reward ke RewardManager
        rewardManager.tambahReward(reward1);

        // Menampilkan available rewards
        rewardManager.tampilkanAvailableRewards();

        // Menukar poin dengan reward
        user1.tukarPoin(reward1);

        // Membuat objek Kuis
        Kuis kuisArtikel1 = new Kuis("Apa manfaat air untuk tubuh?", "Memberikan hidrasi");

        // Membuat objek Artikel
        Artikel artikel1 = new Artikel("Manfaat Air", "Air sangat penting untuk kesehatan tubuh.", kuisArtikel1);

        // Menampilkan artikel
        artikel1.tampilkanArtikel();

        // Menjawab kuis
        kuisArtikel1.jawabKuis("Memberikan energi"); // Jawaban salah
        kuisArtikel1.jawabKuis("Memberikan hidrasi"); // Jawaban benar

        // Membuat objek Komunitas
        Komunitas komunitas1 = new Komunitas("Pecinta Air");

        // Bergabung ke komunitas
        komunitas1.bergabungKomunitas(user1);
        komunitas1.bergabungKomunitas(user2);

        // Menampilkan anggota komunitas
        komunitas1.tampilkanAnggota();

        // Membuat objek NotifikasiPengguna
        NotifikasiPengguna notifikasiUser1 = new NotifikasiPengguna("Hati-hati, Anda sudah melebihi batas penggunaan air harian.");

        // Mengirim notifikasi
        notifikasiUser1.kirimNotifikasi(user1);

        // Logout user
        authManager.logout(user1);

        // Menampilkan informasi objek dengan menggunakan toString
        System.out.println("Informasi AuthManager: " + authManager);
        System.out.println("Informasi Biodata User1: " + biodataUser1);
        System.out.println("Informasi User1: " + user1);
        System.out.println("Informasi Penggunaan Air: " + penggunaanMandi);
        System.out.println("Informasi Poin User1: " + poinUser1);
        System.out.println("Informasi Statistik Penggunaan User1: " + statistikUser1);
        System.out.println("Informasi RewardManager: " + rewardManager);
        System.out.println("Informasi Kuis Artikel1: " + kuisArtikel1);
        System.out.println("Informasi Artikel1: " + artikel1);
        System.out.println("Informasi Komunitas1: " + komunitas1);
        System.out.println("Informasi Notifikasi User1: " + notifikasiUser1);
    }

    private static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}

