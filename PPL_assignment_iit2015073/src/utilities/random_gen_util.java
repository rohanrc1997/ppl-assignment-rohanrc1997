/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import data_structures.boy;
import data_structures.girl;
import dataitem.essential_gift;
import data_structures.gift;
import dataitem.luxury_gift;
import dataitem.utility_gift;

/*This utility class generates random boys, girls and gifts.Also, It uses a dictionary of names for naming girls and boys randomly*/
public class random_gen_util {
    
    private static final int  LUXURY =  6;
    private static final int  ESSENTIAL= 7;
    private static final int  UTILITY = 8;
    
    String boylist[];
    String girllist[];
    public girl g[];
    public boy b[];
    public gift gt[];
   
    
    void build_boylist() throws FileNotFoundException, IOException 
    {  
        int i=0;
        File b_file= new File("boy.txt");
        File directory = new File("./");
       
        
        try (BufferedReader br = new BufferedReader(new FileReader(b_file))) {
            String line = br.readLine();
            boylist[i++]=line;
            
            while (line != null) {
                line = br.readLine();
                boylist[i++]=line;
            }
        }
    }
    
    
    void build_girllist() throws FileNotFoundException, IOException 
    {   int i=0;
        File g_file= new File("girl.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(g_file))) {
            String line = br.readLine();
            girllist[i++]=line;
            
            while (line != null) {
                line = br.readLine();
                girllist[i++]=line;
            }
        }
    }

    void random_gen_gift()
    {   
        int tp,a,bb,c,d;
        Random rand=new Random();
        for(int i=0;i<gt.length;i++)
            {   tp = Math.abs(rand.nextInt()%3) +  6;
                if(tp==LUXURY)
                    {   
                       a=Math.abs(rand.nextInt()%50)+50;
                       bb=Math.abs(rand.nextInt()%100);
                       c=Math.abs(rand.nextInt()%100);
                       d=Math.abs(rand.nextInt()%100);
                       luxury_gift l= new luxury_gift(a,bb,c,d);
                      
                       gt[i]=new gift(l);
                       gt[i].type=LUXURY;
                    }
                
                else if(tp==ESSENTIAL)
                    {  
                       a=Math.abs(rand.nextInt()%50)+50;
                       bb=Math.abs(rand.nextInt()%100);
                       essential_gift e= new essential_gift(a,bb);
                       gt[i]=new gift(e); 
                       gt[i].type=ESSENTIAL;
                       
                    }
                else 
                    {  
                       a=Math.abs(rand.nextInt()%50)+50;
                       bb=Math.abs(rand.nextInt()%100);
                       c=Math.abs(rand.nextInt()%100);
                       d=Math.abs(rand.nextInt()%100);
                       utility_gift u= new utility_gift(a,bb,c,d);
                      
                       gt[i]=new gift(u); 
                       gt[i].type=UTILITY;
                        
                    }
                    
            }
    }
    
    
    void random_gen_boy() throws IOException
    {   
        Random ran=new Random();
        this.boylist=new String[6000];
        int i;
        build_boylist();
        
         for (i=0;i<b.length;i++) {
            int r=Math.abs(ran.nextInt())%4000;
            {   
             
                String name = boylist[r];
                int main = Math.abs(ran.nextInt()%500)+500;
                int attractivens = 50+Math.abs(ran.nextInt()%50);
                int min_attract = 40+Math.abs(ran.nextInt()%50);
                int intell_lvl = 50+Math.abs(ran.nextInt()%50);
                int commit_type = Math.abs(ran.nextInt()%3)+3;
                b[i]=new boy(name ,attractivens ,main, min_attract ,intell_lvl ,commit_type );
                
            }
        }
        
    }
    
    
    void random_gen_girl() throws IOException
    {   
        Random ran=new Random();
        this.girllist=new String[6000];
        int i;
        build_girllist();
        
        for (i=0;i<g.length;i++) {
            int r=Math.abs(ran.nextInt())%4000;
            {  
              
                String name = girllist[r];
                int main = Math.abs(ran.nextInt()%500)+500;
                int attractivens = 50+Math.abs(ran.nextInt()%50);
                int criteria = Math.abs(ran.nextInt()%3);
                int intell_lvl = 50+Math.abs(ran.nextInt()%50);
                int commit_type = Math.abs(ran.nextInt()%3);
                g[i]=new girl (name ,attractivens ,main, criteria ,intell_lvl ,commit_type );
           }
        }
    }
    
    public void random_gen(int bs, int gs, int gfs) throws IOException
    {   int i;
        b=new boy[bs];
        g=new girl[gs];
        gt=new gift[gfs];

        random_gen_boy();
        random_gen_girl();
        random_gen_gift();
        
        print_util p= new print_util(b,g,gt);
      
        
    }
    
    }
