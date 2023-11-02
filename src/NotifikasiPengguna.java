/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
public class NotifikasiPengguna {
    private String pesan;

    public NotifikasiPengguna(String pesan) {
        this.pesan = pesan;
    }

    public String getPesan() {
        return pesan;
    }

    public void kirimNotifikasi(User user, int batasPenggunaanAir) {
        int totalPenggunaan = user.getTotalPenggunaanHariIni();

        if (totalPenggunaan > batasPenggunaanAir) {
            System.out.println("Notifikasi untuk " + user.getUsername() + ": " + pesan);
        } else {
            System.out.println("Penggunaan air masih dalam batas normal.");
        }
    }

    @Override
    public String toString() {
        return "NotifikasiPengguna{" +
                "pesan='" + pesan + '\'' +
                '}';
    }
}

