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

    public void kirimNotifikasi(User user) {
        System.out.println("Notifikasi untuk " + user.getUsername() + ": " + pesan);
    }

    @Override
    public String toString() {
        return "NotifikasiPengguna{" +
                "pesan='" + pesan + '\'' +
                '}';
    }
}

