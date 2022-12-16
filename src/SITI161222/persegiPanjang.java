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
public class persegiPanjang implements Relation{
    private double p;
    private double l;
    
     public persegiPanjang() {
       
    }
    public persegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
     public double getLuas(){
        double panjang = p;
        double lebar = l;
        return (panjang*lebar);
    }
    public boolean isGreater( Object a, Object b){
        double aLen = ((persegiPanjang)a).getLuas();
        double bLen = ((persegiPanjang)b).getLuas();
        return (aLen > bLen);
    }

    public boolean isLess( Object a, Object b){
        double aLen = ((persegiPanjang)a).getLuas();
        double bLen = ((persegiPanjang)b).getLuas();
        return (aLen < bLen);
    }

    public boolean isEqual( Object a, Object b){
        double aLen = ((persegiPanjang)a).getLuas();
        double bLen = ((persegiPanjang)b).getLuas();
        return (aLen == bLen);
    }
}
