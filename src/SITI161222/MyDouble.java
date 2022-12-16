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
public class MyDouble implements Relation{
    @Override
    public boolean isGreater( Object a, Object b){
        return (double)a < (double)b;
    }
    @Override
    public boolean isLess( Object a, Object b){
        return (double)a > (double)b;
    }
    @Override
    public boolean isEqual( Object a, Object b){
        return (double)a == (double)b;
    }
}
