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
public class latihan8 { //operator kondisi
    public static void main(String[] args) {
       String status = ""; 
       int grade = 80; 

       //mendapatkan status pelajar 
       status = (grade >= 60)?"Passed":"Fail"; 
       //print status 
       System.out.println( status );  
    }
}
