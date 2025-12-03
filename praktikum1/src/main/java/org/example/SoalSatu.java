package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SoalSatu {

    public static void main(String[] args) {
        int data;
        List<Integer> ganjil = new ArrayList<>();
        List<Integer> genap = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak data : ");
        data = input.nextInt();

        for (int i = 1; i <= data; i++) {
            if (i % 2 == 0) genap.add(i);
            else  ganjil.add(i);
        }

        String deretGanjil = ganjil.stream().map(String::valueOf).collect(Collectors.joining(" "));
        String deretGenap = genap.stream().map(String::valueOf).collect(Collectors.joining(" "));

        System.out.println("Deret angka ganjil adalah : " + deretGanjil);
        System.out.println("Deret angka genap adalah : " + deretGenap);
    }
}