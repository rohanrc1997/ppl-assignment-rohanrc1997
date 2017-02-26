/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import java.io.IOException;
import java.util.Scanner;
import utilities.*;
import data_structures.*;
import dataitem.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.*;

/*Program for Question1*/
public class q1 {
    
     public static void main(String[] args) {
       
       log_util lu=new log_util();
         try {
             lu.log_init();
         } catch (IOException ex) {
             Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
         }
       Scanner sc= new Scanner(System.in);
       int a,b,c;
       System.out.println("Please Enter the Number Of Boys, Girls and Gifts (in order): ");
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       random_gen_util u= new random_gen_util();
         try {
             u.random_gen(a, b, c);
         } catch (IOException ex) {
             Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
         }
       alloc_couple ac=new alloc_couple();
         try {
             ac.alloc_init(u.b, u.g);
         } catch (IOException ex) {
             Logger.getLogger(q1.class.getName()).log(Level.SEVERE, null, ex);
         }
       ac.print_couple();
       
    
     }
     
}
