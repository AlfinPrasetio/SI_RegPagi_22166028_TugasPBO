/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /*
Nama      : Alfin Prasetio
Nim       : 22166028
Prodi     : Sistem Informasi
Deskripsi : Hari
*/
package si_regularpagi_22166028_latihan26;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Si_RegularPagi_22166028_Latihan26 {
    public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
    }
}