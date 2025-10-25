package org.example.tugas4;

import java.util.Scanner;

public class diskon_jual {
    public static void main(String[] args) {
        Scanner inpHarga = new Scanner(System.in);
        boolean valid = false;
        int belanja = 0;
        double diskon, total;

        System.out.println("Program Menghitung Diskon Belanja...");
        System.out.println("Masukkan total belanja : ");

        do {

            try {
                belanja = inpHarga.nextInt();

                if (belanja >= 0) {
                    valid = true;
                } else {
                    System.out.println("Input tidak valid");
                    System.out.println("Masukkan total belanja : ");
                }
            } catch (Exception e) {
                System.out.println("Masukkan total belanja dalam INT : ");
                inpHarga.nextLine();
            }

        } while(!valid);

        if (belanja >= 1000000) {
            diskon = 0.2;
            total = belanja - (diskon * belanja);
            System.out.printf("Mendapat Diskon 20 persen\nTotal Belanja : Rp.%.0f%n", total);
        } else if (belanja >= 500000) {
            diskon = 0.1;
            total = belanja - (diskon * belanja);
            System.out.printf("Mendapat Diskon 10 persen\nTotal Belanja = Rp.%.0f%n", total);
        } else if (belanja >= 250000) {
            diskon = 0.05;
            total = belanja - (diskon * belanja);
            System.out.printf("Mendapat Diskon 5 persen\nTotal Belanja = Rp.%.0f%n", total);
        } else {
            System.out.println("Tidak mendapat diskon\nTotal Belanja = Rp." + belanja);
        }

        inpHarga.close();
    }
}
