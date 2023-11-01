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

public class Biodata {
    private String namaLengkap;
    private String email;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String nomorTelepon;

    public Biodata(String namaLengkap, String email, Date tanggalLahir, String jenisKelamin, String nomorTelepon) {
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void tampilkanBiodata() {
        System.out.println("Nama: " + namaLengkap);
        System.out.println("Email: " + email);
        System.out.println("Tanggal Lahir: " + new SimpleDateFormat("dd-MM-yyyy").format(tanggalLahir));
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Telepon: " + nomorTelepon);
    }

    public void ubahBiodata(String namaLengkap, String email, Date tanggalLahir, String jenisKelamin, String nomorTelepon) {
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.nomorTelepon = nomorTelepon;
        System.out.println("Biodata berhasil diubah.");
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "namaLengkap='" + namaLengkap + '\'' +
                ", email='" + email + '\'' +
                ", tanggalLahir=" + new SimpleDateFormat("dd-MM-yyyy").format(tanggalLahir) +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", nomorTelepon='" + nomorTelepon + '\'' +
                '}';
    }
}


