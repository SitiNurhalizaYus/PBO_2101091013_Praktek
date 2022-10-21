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

public class latihan4 {
    public static void main(String[]args){
    String angka="";
    angka=JOptionPane.showInputDialog("Silahkan masukkan angka ");
    int z = Integer.valueOf(angka).intValue();

    String hasil="";
    switch(z){
    case 1: hasil+= "Valid Number"; break;
    case 2: hasil+= "Valid Number"; break;
    case 3: hasil+= "Valid Number"; break;
    case 4: hasil+= "Valid Number"; break;
    case 5: hasil+= "Valid Number"; break;
    case 6: hasil+= "Valid Number"; break;
    case 7: hasil+= "Valid Number"; break;
    case 8: hasil+= "Valid Number"; break;
    case 9: hasil+= "Valid Number"; break;
    case 10: hasil+= "Valid Number"; break;
    default: hasil+= "Invalid Number"; break;
    }
    JOptionPane.showMessageDialog(null, hasil);
  }
}
