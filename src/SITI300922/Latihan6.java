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

//import javax.swing.JOptionPane;
import javax.swing.*;

public class Latihan6 {
    public static void main(String[] args) {
        String word = "";
        String word2 = "";
        
        word = JOptionPane.showInputDialog("Masukan kata pertama");
        word2 = JOptionPane.showInputDialog("Masukan kata kedua");
        
        String msg = word +" and "+word2;
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
