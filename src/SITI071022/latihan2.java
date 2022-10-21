/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI071022;

/**
 *
 * @author siti nurhaliza yus
 */
import javax.swing.JOptionPane;

public class latihan2 {
    public static void main(String[] args) {
    String r="";
    String s="";
    String t="";

    r=JOptionPane.showInputDialog("Masukkan nilai pertama Anda");

    int pertama = Integer.valueOf(r).intValue();
    s=JOptionPane.showInputDialog("Masukkan nilai kedua Anda");

    int kedua = Integer.valueOf(s).intValue();
    t=JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");

    int ketiga = Integer.valueOf(t).intValue();   
    int rata_rata=(pertama+kedua+ketiga)/3;

    String hasil= "";

    hasil += "Nilai pertama: " +pertama +"\n";
    hasil += "Nilai kedua: " +kedua +"\n";
    hasil += "Nilai ketiga: " +ketiga +"\n";
    hasil += "Rata-rata nilai Anda adalah " +rata_rata+"\n";

      if (rata_rata<=60){
         hasil +=":-("+"\n";
      }
      else {
         hasil +=":-)"+"\n";
      }
    JOptionPane.showMessageDialog(null, hasil);
    }
}
