package org.example.tugas2;

import java.util.Scanner;
import java.util.ArrayList;

public class kasir {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> namaBarang = new ArrayList<>();
        ArrayList<Integer> hargaBarang = new ArrayList<>();

        String tambah;
        int totalBelanja = 0;

        String barang;
        int harga;
        int jumlah;
        int total;
        do {
            System.out.println("Nama barang : ");
            barang = scan.next();
            namaBarang.add(barang);

            System.out.println("Harga barang : ");
            harga = scan.nextInt();
            hargaBarang.add(harga);

            System.out.println("Jumlah : ");
            jumlah = scan.nextInt();

            total = harga * jumlah;

            totalBelanja += total;

            System.out.println("Tambah? (y/n)");
            tambah = scan.next();
        } while (tambah.equalsIgnoreCase("y"));


        System.out.println("\nNota Belanja");
        for (int i = 0; i < namaBarang.size(); i++) {
            System.out.println("Nama Barang : " + namaBarang.get(i) + " Rp." + hargaBarang.get(i));
        }
        System.out.println("Total Belanja : Rp." + totalBelanja);

        scan.close();
    }
}
