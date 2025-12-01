package org.example;

import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.print("Masukkan pilihan kendaraan yang akan dinaiki (1-6): ");
        pilihan = input.nextInt();

        switch(pilihan) {
            case 1:
                System.out.println("- Pilihan 1 Naik Pesawat Terbang");
                break;
            case 2:
                System.out.println("- Pilihan 2 Naik Kereta Api");
                break;
            case 3:
                System.out.println("- Pilihan 3 Naik Bus");
                break;
            case 4:
                System.out.println("- Pilihan 4 Naik Taksi");
                break;
            case 5:
                System.out.println("- Pilihan 5 Naik Mobil Pribadi");
                break;
            case 6:
                System.out.println("- Pilihan 6 Naik Motor");
                break;
            default:
                System.out.println("Anda salah Memilih");
                break;
        }
    }
}
