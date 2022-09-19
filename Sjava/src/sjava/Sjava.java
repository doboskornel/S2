/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sjava;

/**
 *
 * @author user06
 */
public class Sjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s1 = new String();
       String s2 = new String("Ez " + 1 + " sztring!");
       String s11 = "NYME FMK";
       String s21 = s11 + "INF. INT. " + 2004;
       char[] karaktertomb = {'S', 'o', 'p', 'r', 'o', 'n'}; 
       String s3 = new String(karaktertomb); 
       String s4 = new String(karaktertomb, 2, 3);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s11);
       System.out.println(s21);
       System.out.println(s3);
       System.out.println(s4);
       char ch = s3.charAt(2); 
       char ch2 = "Sopron".charAt(0);
       System.out.println(ch);
       System.out.println(ch2);
       boolean log = false;
       char ch1 = 'X';
       double pi = 3.14;
       String s5 = String.valueOf(log) + String.valueOf(ch1) + String.valueOf(pi);
       
       
      
       
       
       
       
       
    }
    
}
