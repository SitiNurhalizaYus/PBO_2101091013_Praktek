/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI300922;

/**
 *
 * @author siti nurhaliza yus
 */
import javax.swing.JOptionPane;

public class Latihan4 { 
    public static void main( String[] args ){ 
 
        int angka=0;
        int angka2=0; 
        int jumlah=0;
        
        angka = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka pertama")); 
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka kedua"));
        jumlah = angka2+angka; 
        
        String msg = angka+" + "+angka2+" = "+jumlah; 

        JOptionPane.showMessageDialog(null, msg); 
        
    }
 }
