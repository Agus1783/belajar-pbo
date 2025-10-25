package org.example;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;

        System.out.println("Masukkan angka x : ");
        x = input.nextInt();
        System.out.println("Masukkan angka y : ");
        y = input.nextInt();
        System.out.println("Masukkan angka z : ");
        z = input.nextInt();

        if ((x > y && z > y)) {
            if (z / y > 2 && x % 3 != 0) System.out.println("Alpha");
            else System.out.println("Beta");
        } else if (x - y < z / 3) {
            System.out.println("Gamma");
        } else  {
            System.out.println("Delta");
        }

    }
}