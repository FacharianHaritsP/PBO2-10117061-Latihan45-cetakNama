/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan45.cetaknama;

import java.util.Scanner;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mencetak nama
 */
public class Printer {

    private int jmlCetak;
    private String nama;
    Scanner sca = new Scanner(System.in);

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        this.nama = nama;
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda : ");
        this.nama = sca.nextLine();
    }

    public void cetak(int jmlCetak, String nama) {
        this.nama = nama;
        this.jmlCetak = jmlCetak;
        int i;

        System.out.print("Mau cetak berapa kali ? : ");
        jmlCetak = sca.nextInt();
        for (i = 1; i <= jmlCetak; i++) {
            System.out.println("\t\t\t" + nama);
        }

    }

}
