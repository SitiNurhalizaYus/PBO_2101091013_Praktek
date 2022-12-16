/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SITI161222;

/**
 *
 * @author siti nurhaliza yus
 */
public class InterfaceExample {
   public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5, 6);
        boolean hasilDbl = myDouble.isEqual(6.4, 2.2);
        System.out.println("Hasil Integer: " + hasilInt);
        System.out.println("Hasil Double : " + hasilDbl);
       
        Relation myLine = new Line();
        Line line1 = new Line(2,5, 2,3);
        Line line2 = new Line(2,5, 2,2);
        boolean lineA_lineB =  myLine.isGreater(line1, line2);
        System.out.println("Line A > Line B "+ lineA_lineB);
        
        Relation myPersegipanjang =  new persegiPanjang();
        persegiPanjang luas1 = new persegiPanjang(12, 50);
        persegiPanjang luas2 = new persegiPanjang(17, 8);
        boolean hasil = myPersegipanjang.isGreater(luas1, luas2);
        System.out.println("#Persegi Panjang\n Luas1 > Luas2 = " +hasil);
        
//        System.out.println(line1.getLength());
//        System.out.println(line2.getLength());
    } 
}
