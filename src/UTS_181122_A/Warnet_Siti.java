/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_181122_A;

import UTS_181122_A.recordWarnet_Siti;
/**
 *
 * @author siti nurhaliza yus
 */
public class Warnet_Siti {
    public static void main(String[] args) {
        recordWarnet_Siti w1 = new recordWarnet_Siti();
        w1.setKode("001");
        w1.setNamaPelanggan("Siti Nurhaliza Yus");
        w1.setJenisPelanggan("VIP");
        w1.setTglMasuk("18 Nov 2022");
        w1.setJamMasuk(10);
        w1.setJamKeluar(12);
        w1.setTarif(2000);
        
        //
        System.out.println("Kode            :"+w1.getKode());
        System.out.println("Nama Pelanggan  :"+w1.getNamaPelanggan());
        System.out.println("Jenis Pelanggan :"+w1.getJenisPelanggan());
        System.out.println("Tanggal Masuk   :"+w1.getTglMasuk());
        System.out.println("Jam Masuk       :"+w1.getJamMasuk());
        System.out.println("Jam Keluar      :"+w1.getJamKeluar());
        
        System.out.println("\nLama            :"+w1.getLama());
        System.out.println("Tarif           :"+w1.getTarif());
        System.out.println("Diskon          :"+w1.getTarifDiskon());
        System.out.println("Total Bayar     :"+w1.getTotalBayar());
    }
}
