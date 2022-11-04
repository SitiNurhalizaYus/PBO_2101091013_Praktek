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
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        student1.setName("Siti");
        student1.setAddress("Padang");
        student1.setAge(19);
        student1.setMathGrade(80);
        student1.setEnglishGrade(90);
        student1.setScienceGrade(100);
        //
        System.out.println("Nama            :"+student1.getName());
        System.out.println("Alamat          :"+student1.getAddress());
        System.out.println("Umur            :"+student1.getAge());
        System.out.println("Matematika      :"+student1.getMathGrade());
        System.out.println("B.Inggris       :"+student1.getEnglishGrade());
        System.out.println("Pengetahuan     :"+student1.getScienceGrade());
        System.out.println("Rata-rata       :"+student1.getAverage());
        System.out.println("Nilai max       :"+student1.getMax());
        System.out.println("Nilai min       :"+student1.getMin());
        
    }
}
