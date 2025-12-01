package org.example;

import java.util.Scanner;

public class SoalEmpat {
    public static void main(String[] args) {
        int data, angka;
        float jumlah = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data: ");
        data = input.nextInt();

        for (int i = 1; i <= data; i++) {
            System.out.print("Data ke-" + i + ": ");
            angka = input.nextInt();
            jumlah += angka;
        }

        float rata = jumlah / data;
        System.out.println("Rata-rata: " + rata);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Press any key to continue...");
    }
}
