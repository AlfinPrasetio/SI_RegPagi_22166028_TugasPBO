/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /*
Nama      : Alfin Prasetio
Nim       : 22166028
Prodi     : Sistem Informasi
Deskripsi : Rata-rata Nilai
*/
package si_regpagi_22166028_latihan21;
import java.util.Scanner;
public class Si_RegPagi_22166028_Latihan21 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nilai[i];
        }

        double average = (double) sum / n;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + average);
    }
}