/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.util.HashMap;
import java.util.Map;

public class StatistikPenggunaan {
    private Map<String, Integer> aktivitasPenggunaan;

    public StatistikPenggunaan() {
        this.aktivitasPenggunaan = new HashMap<>();
    }

    public void catatPenggunaan(String aktivitas, int jumlah) {
        aktivitasPenggunaan.put(aktivitas, jumlah);
        System.out.println("Penggunaan air " + aktivitas + " sebanyak " + jumlah + " liter berhasil dicatat.");
    }

    public void tampilkanStatistik() {
        System.out.println("Statistik Penggunaan Air:");
        for (Map.Entry<String, Integer> entry : aktivitasPenggunaan.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " liter");
        }
    }

    @Override
    public String toString() {
        return "StatistikPenggunaan{" +
                "aktivitasPenggunaan=" + aktivitasPenggunaan +
                '}';
    }
}

