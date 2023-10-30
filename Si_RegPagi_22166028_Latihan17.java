/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166028_latihan17;

import java.util.Scanner;

/**
Nama      : Alfin Prasetio
Nim       : 22166028
Prodi     : Sistem Informasi
Deskripsi : Masukkan Gaji Pokok 
 */
public class Si_RegPagi_22166028_Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Scanner input = new Scanner(System.in);

        // Memasukkan gaji pokok
        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = input.nextDouble();

        // Memasukkan status pernikahan
        System.out.print("Apakah Anda sudah menikah? (true/false): ");
        boolean menikah = input.nextBoolean();

        // Menghitung tunjangan berdasarkan aturan
        double tunjangan = 0;
        if (menikah) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + totalGaji);
    }
}
