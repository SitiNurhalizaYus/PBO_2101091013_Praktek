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

import java.io.*;

public class Latihan5 {
    public static void main(String[] args) {
         BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
        String word = "";
        String word2 = "";
        String word3 = "";
        
        try{
            System.out.print("Enter word1 : ");
            word = dataIn.readLine();
            System.out.print("Enter word2 : ");
            word2 = dataIn.readLine();
            System.out.print("Enter word3 : ");
            word3 = dataIn.readLine();
            
        }
        catch( IOException e ){
            System.out.println("Error !");
        }
        System.out.println(word+" "+word2+" "+word3);
    }
}
