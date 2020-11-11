/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan41.massajenis;

import model.Kubus;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung massa jenis kubus
 */
public class PBOIF210119064Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek Kubus
        Kubus kubus = new Kubus();
        
        //input
        System.out.println("=====Massa Jenis Kubus=====");
        kubus.setSisi(5); // input nilai sisi
        System.out.println("Sisi  : " + kubus.getSisi());
        kubus.setMassa(250); //input nilai massa
        System.out.println("Massa : " + kubus.getMassa());

        //output
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
    }
    
}
