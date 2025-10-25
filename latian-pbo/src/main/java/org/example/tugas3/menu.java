package org.example.tugas3;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        rumus perpan = new rumus();
        rumus lingkaran = new rumus();
        rumus segitiga = new rumus();

        int pilihan;
        boolean valid;


        do {

            System.out.println("Menu Program...");
            System.out.println(
                    "1. Persegi Panjang \n2. Lingkaran \n3. Segitiga \n4. Keluar\n"
            );
            System.out.println("Input angka 1-4...\n");

            valid = false;
            pilihan = 0;

            do {
                try {
                    pilihan = scan.nextInt();

                    if (pilihan >= 1 && pilihan <= 4) {
                        valid = true;
                    } else {
                        System.out.println("Input angka tidak valid");
                    }

                } catch (Exception e) {
                    System.out.println("Harus input angka");
                    scan.nextLine();
                }

            } while (!valid);

            switch (pilihan) {
                case 1:
                    perpan.perpan();
                    break;
                case 2:
                    lingkaran.lingkaran();
                    break;
                case 3:
                    segitiga.segitiga();
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
            }

        } while (pilihan != 4);

        scan.close();
    }
}
