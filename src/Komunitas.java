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

public class Komunitas {
    private String nama;
    private List<User> anggota;

    public Komunitas(String nama) {
        this.nama = nama;
        this.anggota = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public List<User> getAnggota() {
        return anggota;
    }

    public void bergabungKomunitas(User user) {
        anggota.add(user);
        System.out.println(user.getUsername() + " bergabung dengan komunitas " + nama);
    }

    public void tampilkanAnggota() {
        System.out.println("Anggota Komunitas " + nama + ":");
        for (User user : anggota) {
            System.out.println("- " + user.getUsername());
        }
    }

    @Override
    public String toString() {
        return "Komunitas{" +
                "nama='" + nama + '\'' +
                ", anggota=" + anggota +
                '}';
    }
}


