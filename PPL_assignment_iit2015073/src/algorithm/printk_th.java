/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.couple;
import java.util.Scanner;

/*To find and print the k-most happiest and compatible couples*/
public class printk_th {
        
        public void printk(couple c[])
        {   
            int t;
            sort_class st=new sort_class();
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the value of k: ");
            int k= sc.nextInt();
            System.out.println("\n The k-th Most Happiest Couples are:(in decreasing order) ");
            st.sort_happy(c);
            System.out.println("|| BOY NAME | GIRL NAME | HAPPINESS ||");
            t=0;
            while(t<k)
            {
                System.out.println(c[t].b.name+" "+c[t].g.name+" "+c[t].hapiness);
                t++;
            }
                
            
       
            t=0;
            st.sort_comp(c);
            System.out.println(" \n \n The k-th Most Happiest Couples are:(in decreasing order): ");
            System.out.println("|| BOY NAME | GIRL NAME | COMPATIBILITY ||");
            while(t<k)
                {    System.out.println(c[t].b.name+" "+c[t].g.name+" "+c[t].compability);
                     t++;
                }
            }
            
        }
