package org.example;

import java.util.Scanner;

public class Project1 {
    static int hitung(int n) {
        if (n <= 1) {
            return 1;
        } else if (n % 2 != 0){ // debug teori, untuk menghitung faktorial penjumlahan
            return n + hitung(n - 1);
        } else {
            return n - hitung(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        try {
            int angka = input.nextInt();

            int hasil = hitung(angka);

            if (hasil % 2 == 0) {
                System.out.println("\nGenap-" + hasil);
            }
            else {
                System.out.println("\nGanjil-" + (hasil + 1));
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        }

    }
}