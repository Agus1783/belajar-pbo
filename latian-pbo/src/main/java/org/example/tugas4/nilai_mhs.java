package org.example.tugas4;

import java.util.Scanner;

public class nilai_mhs {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        float nilai = 0;
        boolean valid = false;

        System.out.println("Program Menghitung Nilai Mahasiswa...");
        System.out.println("Masukkan rata-rata nilai : ");

        do {

            try {
                nilai = input1.nextFloat();

                if (nilai >= 0.0 && nilai <= 100.00) {
                    valid = true;
                } else {
                    System.out.println("Nilai tidak valid!");
                }

            } catch (Exception e) {
                System.out.println("Nilai harus berbentuk Float");
                input1.nextLine();
            }

        } while(!valid);

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai A (Sangat Baik)");
        } else if (nilai >= 70 && nilai < 85) {
            System.out.println("Nilai B (Baik)");
        } else if (nilai >= 55 && nilai < 70) {
            System.out.println("Nilai C (Cukup");
        } else if (nilai >= 40 && nilai < 55) {
            System.out.println("Nilai D (Kurang)");
        } else {
            System.out.println("E (Sangat kurang)");
        }

        input1.close();

    }
}
