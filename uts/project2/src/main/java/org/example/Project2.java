package org.example;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Masukkan angka a : ");
        a = input.nextInt();
        System.out.println("Masukkan angka b : ");
        b = input.nextInt();
        System.out.println("Masukkan angka c : ");
        c = input.nextInt();

        if (a * b < c + 3) {
            switch (a * b) {
                case 8:
                    System.out.println("X");
                    break;
                case 9:
                    System.out.println("Y");
                    break;
                default:
                    System.out.println("Z");
                    break;
            }
        } else if (a + b == c) {
            if (b % a == 1) System.out.println('A');
            else System.out.println("B");
        } else {
            System.out.println("C");
        }
        System.out.println("End");
    }
}