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
public class RecordBukuAlamat {
    private String Nama; 
    private String Alamat;
    private String NomorTelepon;
    private String AlamatEmail;
    private int bukuCount;
    
    public String getNama(){
    return Nama;
    }
    
    public String getAlamat(){
    return Alamat;
    }
    
    public String getNomorTelepon(){
    return NomorTelepon;
    }
    
    public String getAlamatEmail(){
    return AlamatEmail;
    }
    
    public int getbukuCount(){
    return bukuCount;
    }
    
  public RecordBukuAlamat(){ 
      bukuCount++;
  }
    
  public RecordBukuAlamat(String Nama, String Alamat,String NomorTelepon, String AlamatEmail){ 
    this.Nama = Nama; 
    this.Alamat = Alamat; 
    this.NomorTelepon = NomorTelepon; 
    this.AlamatEmail = AlamatEmail; 
    bukuCount++;
    }
}

