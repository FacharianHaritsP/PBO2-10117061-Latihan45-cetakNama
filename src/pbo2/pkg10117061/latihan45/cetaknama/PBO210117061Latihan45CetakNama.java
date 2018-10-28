/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan45.cetaknama;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mencetak nama
 */
public class PBO210117061Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer ptr = new Printer();
    
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());

    }

}
