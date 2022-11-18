/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_181122_A;

/**
 *
 * @author siti nurhaliza yus
 */
public class recordWarnet_Siti {
    private String Kode; 
    private String NamaPelanggan;
    private String JenisPelanggan;
    private String TglMasuk;
    private int JamMasuk;
    private int JamKeluar;
    private long Tarif;
    //area penulisan kode selanjutnya 
    private long TarifDiskon;
    private int Lama;
    private long TotalBayar;
    
    
    public String getKode(){
    return Kode;
    }
    
    public void setKode(String Kode){
    this.Kode = Kode;
    }
    
    public String getNamaPelanggan(){
    return NamaPelanggan;
    }
    
    public void setNamaPelanggan(String NamaPelanggan){
    this.NamaPelanggan = NamaPelanggan;
    }
    
    public String getJenisPelanggan(){
    return JenisPelanggan;
    }
    
    public void setJenisPelanggan(String JenisPelanggan){
    this.JenisPelanggan = JenisPelanggan;
    }
    
    public String getTglMasuk(){
    return TglMasuk;
    }
    
    public void setTglMasuk(String TglMasuk){
    this.TglMasuk = TglMasuk;
    }
    
    public int getJamMasuk(){
    return JamMasuk;
    }
    
    public void setJamMasuk(int JamMasuk){
    this.JamMasuk = JamMasuk;
    }
    
    public int getJamKeluar(){
    return JamKeluar;
    }
    
    public void setJamKeluar(int JamKeluar){
    this.JamKeluar = JamKeluar;
    }
    
    public long getLama(){
    Lama = (JamKeluar-JamMasuk);
    return Lama;
    }
    
    public void setTarif(long Tarif){
    this.Tarif = Tarif;
    }
    
    public long getTarif(){
    return Tarif;
    }
    
    public long getTarifDiskon(){
      if((JenisPelanggan=="VIP") && (Lama>2)){
        TarifDiskon=2/100*Tarif;        
      }
      else{
        TarifDiskon=5/100*Tarif;
      }
    return TarifDiskon;
    }
    
    public long getTotalBayar(){
    TotalBayar = (Lama*Tarif-TarifDiskon);
    return TotalBayar;
    }
    
//    public double getMax(){
//    max = (int) ((mathGrade>=englishGrade)?mathGrade:englishGrade);
//    max = (int) (( scienceGrade>=max)? scienceGrade:max);
//    return max;
//    }
//    
//    public double getMin(){
//    min = (int) ((mathGrade<=englishGrade)?mathGrade:englishGrade);
//    min = (int) (( scienceGrade<=min)? scienceGrade:min);
//    return min;
//    }
//   
//    public int getStudentCount(){
//    return studentCount;
    }

