package org.example;

import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        int a1, a2, hasil;
        Scanner isi = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        a1 = isi.nextInt();
        System.out.println("Masukkan angka : ");
        a2 = isi.nextInt();

        hasil = a1 + a2;
        System.out.println("Hasil adalah : "+hasil);
    }
}
