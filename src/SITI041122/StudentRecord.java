/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI041122;

/**
 *
 * @author siti nurhaliza yus
 */
public class StudentRecord 
{ 
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private double max; 
    private double min; 
    private int studentCount;
    //area penulisan kode selanjutnya 
    
    public String getName(){
    return name;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public String getAddress(){
    return address;
    }
    
    public void setAddress(String address){
    this.address = address;
    }
    
    public int getAge(){
    return age;
    }
    
    public void setAge(int age){
    this.age = age;
    }
    
    public double getMathGrade(){
    return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
    this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
    return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
    this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
    return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
    this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
    average = (mathGrade+englishGrade+scienceGrade)/3;
    return average;
    }
    
    public double getMax(){
    max = (int) ((mathGrade>=englishGrade)?mathGrade:englishGrade);
    max = (int) (( scienceGrade>=max)? scienceGrade:max);
    return max;
    }
    
    public double getMin(){
    min = (int) ((mathGrade<=englishGrade)?mathGrade:englishGrade);
    min = (int) (( scienceGrade<=min)? scienceGrade:min);
    return min;
    }
   
    
    public int getStudentCount(){
    return studentCount;
    }
}

