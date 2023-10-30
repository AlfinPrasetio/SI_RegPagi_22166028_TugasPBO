/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /*
Nama      : Alfin Prasetio
Nim       : 22166028
Prodi     : Sistem Informasi
Deskripsi : Hitung saldo perbulan
*/
package si_regpagi22166028_latihan20;
import java.text.DecimalFormat;
public class Si_REGPAGI22166028_Latihan20 {
    public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 3500000;
        // Bunga per Bulan (dalam persen)
        double BungaPerBulan = 8.0;
        // Lama (bulan)
        double saldoTarget = 6000000;
        
         // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        // Hitung saldo per bulan
        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (BungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;
        // Format saldo per bulan sebagai mata uang
        String saldoBulanFormatted = df.format(saldoAwal);
        System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
}
        }
    }