package org.example;

import java.util.Scanner;

public class latian1 {
    public static void main(String[] args) {
        // menghitung penjumlahan 2 bilangan pecahan
        float a, b, hasilTambah, hasilKali;
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        hasilTambah = a + b;
        hasilKali = a * b;
        System.out.println("Hasil penjumlahan nya adalah " + hasilTambah);
        System.out.println("Hasil perkalian nya adalah " + hasilKali);
        // menghitung pengurangan bilangan bulat
        int c, d, hasilKurang;
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        d = scan.nextInt();
        hasilKurang = c - d;
        System.out.println("Hasil pengurangan bilangan bulat nya adalah " + hasilKurang);
    }
}