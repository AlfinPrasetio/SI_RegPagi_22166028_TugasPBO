/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /*
Nama      : Alfin Prasetio
Nim       : 22166028
Prodi     : Sistem Informasi
Deskripsi : Masukkan Nama Depan
*/
package si_regularpagi_22166028_latihan25;
import java.util.Scanner;
public class Si_RegularPagi_22166028_Latihan25 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String name = input.nextLine();

        System.out.println("Ejaan untuk \"" + name + "\" adalah :");
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + name.charAt(i));
        }
    }
}