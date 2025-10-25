package org.example;

import javax.swing.JOptionPane;

public class latihan4 {
    public static void main(String[] args) {
        int a1, a2, hasil;
        String isiSatu = JOptionPane.showInputDialog("Masukkan angka : ");
        a1 = Integer.parseInt(isiSatu);

        String isiDua = JOptionPane.showInputDialog("Masukkan angka : ");
        a2 = Integer.parseInt(isiDua);

        hasil = a1 + a2;
        JOptionPane.showMessageDialog(null, "Hasil nya adalah " + hasil);
    }
}
