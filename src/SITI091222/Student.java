/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI091222;

/**
 *
 * @author siti nurhaliza yus
 */
public class Student extends Person { 
    
    public Student(){ 
        super( "Siti", "Padang" ); 
        System.out.println("Inside Student:Constructor"); 
    } 
    
   public String getName(){ 
        System.out.println("Student Name: " + name); 
        return name; 
   }
   
   public static void main(String[] args) {
       Student student = new Student();
       System.out.println("Nama\t:"+student.getName());
       System.out.println("Alamat\t:"+student.getAddress());
   }
} 


