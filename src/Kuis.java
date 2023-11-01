/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
public class Kuis {
    private String pertanyaan;
    private String jawabanBenar;

    public Kuis(String pertanyaan, String jawabanBenar) {
        this.pertanyaan = pertanyaan;
        this.jawabanBenar = jawabanBenar;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public void jawabKuis(String jawaban) {
        if (jawaban.equalsIgnoreCase(jawabanBenar)) {
            System.out.println("Jawaban benar!");
        } else {
            System.out.println("Jawaban salah.");
        }
    }

    @Override
    public String toString() {
        return "Kuis{" +
                "pertanyaan='" + pertanyaan + '\'' +
                ", jawabanBenar='" + jawabanBenar + '\'' +
                '}';
    }
}


