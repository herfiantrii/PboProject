/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
public class Artikel {
    private String judul;
    private String konten;
    private Kuis kuis;

    public Artikel(String judul, String konten, Kuis kuis) {
        this.judul = judul;
        this.konten = konten;
        this.kuis = kuis;
    }

    public String getJudul() {
        return judul;
    }

    public String getKonten() {
        return konten;
    }

    public Kuis getKuis() {
        return kuis;
    }

    public void tampilkanArtikel() {
        System.out.println("Judul Artikel: " + judul);
        System.out.println("Konten: " + konten);
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "judul='" + judul + '\'' +
                ", konten='" + konten + '\'' +
                ", kuis=" + kuis +
                '}';
    }
}


