package org.example.hitungbangun;

import java.util.Scanner;

public class hitungbangun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        perpan perpan = new perpan();
        bola bola = new bola();
        trapesium trapesium = new trapesium();

        System.out.println("""
                           Program Hitung Bangun \s
                           1. Luas dan Keliling Persegi Panjang\s
                           2. Luas dan Keliling Lingkaran\s
                           3. Luas Bola\s
                           4. Luas Trapesium""");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1 -> {
                System.out.println("Persegi Panjang");
                System.out.println("Input panjang dan lebar persegi panjang");
                int p = input.nextInt();
                int l = input.nextInt();
                int luasPerpan = perpan.luasPerpan(p, l);
                int kelPerpan = perpan.kelPerpan(p, l);
                System.out.println("\nLuas Persegi Panjang : " + luasPerpan);
                System.out.println("\nKeliling Persegi Panjang : " + kelPerpan);
            }
            case 2 -> {
                System.out.println("Luas dan Keliling Lingkaran");
                System.out.println("Input jari-jari Lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = lingkaran.hitungLuas(jariJari);
                double kelLingkaran = lingkaran.hitungKeliling(jariJari);
                System.out.printf("Luas Lingkaran : %.2f%n", luasLingkaran);
                System.out.printf("Keliling Lingkaran : %.2f%n", kelLingkaran);
            }
            case 3 -> {
                System.out.println("Luas Bola");
                System.out.println("Input diameter bola");
                double diameter = input.nextDouble();
                double luasBola = bola.luasBola(diameter);
                System.out.printf("\nLuas Bola : %.2f%n", luasBola);
            }
            case 4 -> {
                System.out.println("Luas Trapesium");
                System.out.print("Input sisi satu, sisi dua, dan tinggi trapesium :");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                double luasTrapesium = trapesium.luasTrap(a, b, c);
                System.out.printf("Luas Trapesium :  %.2f%n", luasTrapesium);
            }
            default -> System.out.println("Input tidak valid.");
        }
    }

}