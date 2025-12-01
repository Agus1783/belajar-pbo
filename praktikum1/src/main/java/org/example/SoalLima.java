package org.example;

public class SoalLima {
    public static void main(String[] args) {
        float fahrenheit;
        System.out.println("------------------------");
        System.out.println("CELCIUS               FAHRENHEIT");
        System.out.println("------------------------");
        for (int i = 1; i <= 10; i++) {
            fahrenheit = ((float) (i * 9) / 5) + 32;
            System.out.println("Celcius : " + i + " Fahrenheit : " + fahrenheit);
        }
        System.out.println("------------------------");
        System.out.println("Press any key to continue...");
    }
}
