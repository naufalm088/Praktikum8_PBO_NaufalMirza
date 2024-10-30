/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.time.YearMonth;

public class HitungHari {
    public int hitung(int tahun, String bulan) {
        int bulanIndex = getBulanIndex(bulan);
        YearMonth yearMonth = YearMonth.of(tahun, bulanIndex);
        return yearMonth.lengthOfMonth();
    }

    private int getBulanIndex(String bulan) {
        switch (bulan) {
            case "Januari": return 1;
            case "Februari": return 2;
            case "Maret": return 3;
            case "April": return 4;
            case "Mei": return 5;
            case "Juni": return 6;
            case "Juli": return 7;
            case "Agustus": return 8;
            case "September": return 9;
            case "Oktober": return 10;
            case "November": return 11;
            case "Desember": return 12;
            default: return 0;
        }
    }
}

