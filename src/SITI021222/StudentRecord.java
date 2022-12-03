/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI021222;

/**
 *
 * @author siti nurhaliza yus
 */
public class StudentRecord {
    private String [] Name=new String[100];  
    private String [] Address=new String[100]; 
    private String [] Telpn=new String[100]; 
    private String [] Email=new String[100]; 
   
    public static int studentCount;
    public static int index;
    
    public StudentRecord(){ //construktor
    studentCount=0;
    }
    public String getName(int index){
    return Name[index];
    }
    public String getAddress(int index){
    return Address[index];
    }
    public String getTelpn(int index){
    return Telpn[index];
    }    
    public String getEmail(int index){
    return Email[index];
    }
    
    public void setNama(String name,int index, String address, String telpn, String email){
    Name[index] = name;
    Address[index] = address;
    Telpn[index] = telpn;
    Email[index] = email;
    studentCount++;
    }
    
    public static int getstudentCount(){
        return studentCount;
    }
}
