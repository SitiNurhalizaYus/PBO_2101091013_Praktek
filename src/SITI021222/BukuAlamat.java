/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI021222;

/**
 *
 * @author siti nurhaliza yus
 */
public class BukuAlamat {
    public static void main(String[] args) {
    RecordBukuAlamat sitiRecord=new RecordBukuAlamat("Siti Nurhaliza Yus","Indonesia","083121741053","snyzaa21@gmail.com"); 
    
     System.out.println("Nama            :"+sitiRecord.getNama());
     System.out.println("Alamat          :"+sitiRecord.getAlamat());
     System.out.println("Nomor Telepon   :"+sitiRecord.getNomorTelepon());
     System.out.println("Alamat E-Mail   :"+sitiRecord.getAlamatEmail());
    }
}
