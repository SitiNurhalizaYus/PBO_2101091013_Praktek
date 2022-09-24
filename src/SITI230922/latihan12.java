/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI230922;

/**
 *
 * @author siti nurhaliza yus
 */
public class latihan12 {
    public static void main(String[] args) {
       int i = 10;
       int j = 23;
       int k = 5;
       int hasil;
       
       System.out.println("number 1 = " + i);
       System.out.println("number 2 = " + j);
       System.out.println("number 3 = " + k);
       
       hasil = (i>=j)?i:j;
       hasil = (k>=hasil)?i:hasil;      
       
       System.out.println("Nilai tertingginya adalah = "+hasil);
    }
}
