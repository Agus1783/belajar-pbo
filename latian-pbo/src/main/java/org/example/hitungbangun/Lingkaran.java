package org.example.hitungbangun;

public class Lingkaran {
    //    kontstanta untuk PI Lingkaran
    public static final double PI = Math.PI;

    //    keliling lingkaran
    public double hitungKeliling(double jariJari) {
        return 2 * PI * jariJari;
    }

    //    luas lingkaran
    public double hitungLuas(double jariJari) {
        return PI * (jariJari * jariJari);
    }
}
