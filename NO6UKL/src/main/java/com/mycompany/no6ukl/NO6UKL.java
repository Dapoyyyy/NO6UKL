/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no6ukl;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class NO6UKL {

   


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        char golongan;
        int pemakaian;
        int tarif = 0;
        
        System.out.print("Masukkan nama pelanggan: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan golongan listrik (A/B/C): ");
        golongan = input.next().toUpperCase().charAt(0);
        
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        pemakaian = input.nextInt();
        
       
        switch (golongan) {
            case 'A':
                tarif = 1200;
                break;
            case 'B':
                tarif = 1500;
                break;
            case 'C':
                tarif = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }
        
        double totalAwal = tarif * pemakaian;
        double totalAkhir = totalAwal;
        
       
        if (pemakaian > 500) {
            double tambahan = totalAwal * 0.10;
            totalAkhir += tambahan;
        }
        
       
        System.out.println("\n=== Rincian Tagihan Listrik ===");
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Pemakaian: " + pemakaian + " kWh");
        System.out.println("Total sebelum tambahan: Rp " + totalAwal);
        System.out.println("Total tagihan akhir: Rp " + totalAkhir);
    }
}
