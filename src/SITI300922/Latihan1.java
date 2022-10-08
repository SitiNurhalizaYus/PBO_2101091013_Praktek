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
//import java.io.BufferedReader; 
//import java.io.InputStreamReader; 
//import java.io.IOException; 

import java.io.*;

public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        String name = ""; 
        String address = ""; 
        String jurusan = ""; 

        try{ 
        System.out.print("Please Enter Your Name : ");
        name = dataIn.readLine(); 
        
        System.out.print("Please Enter Your Address : ");
        address = dataIn.readLine(); 
        
        System.out.print("Jurusan : ");
        jurusan = dataIn.readLine(); 
        }
        catch( IOException e ){ 
        System.out.println("Error!"); 
        } 

        System.out.println("Hello " + name +"!");
        System.out.println("Kamu tinggal di " + address);
        System.out.println("Kamu dari jurusan " + jurusan);
    }
}
