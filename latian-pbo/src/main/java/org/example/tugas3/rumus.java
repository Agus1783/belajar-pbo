package org.example.tugas3;

import javax.swing.JOptionPane;

public class rumus {

    public static final double PI = Math.PI;

    public void perpan() {
        String inSatu = JOptionPane.showInputDialog("Masukkan Panjang persegi : ");
        int panjang = Integer.parseInt(inSatu);

        String inDua = JOptionPane.showInputDialog("Masukkan Lebar persegi : ");
        int lebar = Integer.parseInt(inDua);

        int luasPerpan = panjang * lebar;
        int kelPerpan = 2 * (panjang + lebar);

        JOptionPane.showMessageDialog(null, "Luas persegi panjang : " + luasPerpan +
                "\nKeliling persegi : " + kelPerpan);
    }

    public void lingkaran() {
        String jari = JOptionPane.showInputDialog("Masukkan jari-jari : ");
        float  jariJari = Float.parseFloat(jari);

        double hasilLuas = PI * (jariJari * jariJari);
        double hasilKeliling = 2 * (PI * jariJari);

        String formatLuas = String.format("%.2f", hasilLuas);
        String formatKel = String.format("%.2f", hasilKeliling);
        JOptionPane.showMessageDialog(null, "Hasil Luas : " + formatLuas +
                "Hasil keliling : " +  formatKel);
    }

    public void segitiga() {
        String inAlas = JOptionPane.showInputDialog("Masukkan Alas : ");
        int alas = Integer.parseInt(inAlas);

        String inTinggi = JOptionPane.showInputDialog("Masukkan Tinggi : ");
        int  tinggi = Integer.parseInt(inTinggi);

        double luasSeg = (0.5 * alas) * tinggi;
        String formatLuas = String.format("%.2f", luasSeg);
        JOptionPane.showMessageDialog(null, "Luas Segitiga : " + formatLuas);

    }

}
