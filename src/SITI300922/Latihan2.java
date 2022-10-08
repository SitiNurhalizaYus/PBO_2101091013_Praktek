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

import java.io.*;

public class Latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int angka=0; 
        int angka2=0; 
        int jumlah=0; 
   
        try{ 
        System.out.print("Masukan angka pertama : ");
        angka = Integer.parseInt(dataIn.readLine()); 
        
        System.out.print("Masukan angka kedua : ");
        angka2 = Integer.parseInt(dataIn.readLine());
        
        jumlah = angka + angka2;
        }
        catch( IOException e ){ 
        System.out.println("Error!"); 
        } 

        System.out.println(angka+" + "+angka2+" = "+jumlah);
    } 
}
