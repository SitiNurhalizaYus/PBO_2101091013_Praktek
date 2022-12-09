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
public class PolimorfismeExample {
    public static void main(String[] args) {
        Person ref;
        Student student = new Student();
        Employee employee = new Employee();
        ref = student;
        String temp = ref.getName();
        System.out.println("Nama "+temp); 
        ref = employee; 
        String temp1 = ref.getName();
        System.out.println("Nama "+temp1);
    }
 }
