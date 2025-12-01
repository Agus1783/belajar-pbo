package org.example;

import java.util.Scanner;

public class SoalEnam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;
        System.out.print("Input bilangan : ");
        bilangan = input.nextInt();

        System.out.println("Segitiga sama sisi, sisi="+bilangan);

        for (int i = bilangan; i >= 1; i--) {
            for (int j = 1; j <= bilangan - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Segitiga siku-siku dengan alas="+bilangan+", tinggi="+bilangan);
        for (int i = 1; i <= bilangan; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
