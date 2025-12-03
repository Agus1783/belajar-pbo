package org.example;

import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        int BanyakBarang, harga, qty, SubTotal;
        int barang = 1;
        int TotalBelanja = 0;
        String NomorNota, nama,  kode;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak barang yang dibeli: ");
        BanyakBarang = input.nextInt();
        System.out.print("No. Nota: ");
        NomorNota = input.next();

        while (barang <= BanyakBarang) {
            System.out.println("\nBarang ke: " + barang);
            System.out.println("------------------------");
            System.out.print("Kode barang: ");
            kode = input.next();
            System.out.print("Nama Barang: ");
            nama = input.next();
            System.out.print("Harga @ Rp: ");
            harga = input.nextInt();
            System.out.print("Qty beli: ");
            qty = input.nextInt();

            SubTotal = qty * harga;
            TotalBelanja += SubTotal;
            System.out.println("Sub Total: " + SubTotal);
            barang++;
        }
        System.out.println("------------------------------------------------- +");
        System.out.println("Total belanja yang harus dibayar: Rp." + TotalBelanja);
    }
}
