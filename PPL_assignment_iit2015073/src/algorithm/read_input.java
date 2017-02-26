/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.boy;
import data_structures.gift;
import data_structures.girl;
import dataitem.essential_gift;
import dataitem.luxury_gift;
import dataitem.utility_gift;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 To read the input from the input.txt containing random data 
 */
public class read_input {
        
        private static final int LUXURY =  6;
        private static final int ESSENTIAL= 7;
        private static final int UTILITY = 8;
    
        public gift gt[];
        public boy b[];
        public girl g[];
        
        
        void alloc(int bs,int gs, int gfs)
        {
            gt=new gift[gfs];
            b=new boy[bs];
            g=new girl[gs];
        }
        
        
        void get_inp() throws IOException
        {  
            int bs,gs,gfs,i=0;
            BufferedReader input = null;
            String el = System.getProperty("line.separator");
            String line=null,sp=" ";
            
            try {
                File file = new File("input.txt");
                input = new BufferedReader(new FileReader(file));
                
                line=input.readLine();
                StringTokenizer st = new StringTokenizer(line," "); 
                bs=Integer.parseInt(st.nextToken());
                gs=Integer.parseInt(st.nextToken());
                gfs=Integer.parseInt(st.nextToken());
                
                this.alloc(bs,gs,gfs);
                
                while(!line.equals("bbreak") )
                    {   line=input.readLine(); 
                        st = new StringTokenizer(line," "); 
                        System.out.println(line);
                        while(st.hasMoreTokens())
                        {       System.out.println(st.nextToken());
                               String name=st.nextToken();      
                                int main = Integer.parseInt(st.nextToken());
                                int attractivens = Integer.parseInt(st.nextToken());
                                int min_attract = Integer.parseInt(st.nextToken());
                                int intell_lvl = Integer.parseInt(st.nextToken());
                                int commit_type = Integer.parseInt(st.nextToken());
                                b[i++]=new boy(name ,attractivens ,main, min_attract ,intell_lvl ,commit_type ); 
                                System.out.println(name +sp+ attractivens +sp+ main +sp+ min_attract +sp+intell_lvl +sp+commit_type);
                        } } 
                    
                i=0;
                while(!line.equals("gbreak"))
                    {   line=input.readLine(); 
                        st = new StringTokenizer(line," ");  
                            
                          while(st.hasMoreTokens())
                        {
                                String name=st.nextToken();      
                                int main = Integer.parseInt(st.nextToken());
                                int attractivens = Integer.parseInt(st.nextToken());
                                int intellec = Integer.parseInt(st.nextToken());
                                int criteria = Integer.parseInt(st.nextToken());
                                int commit_type = Integer.parseInt(st.nextToken());
                                g[i++]=new girl(name ,attractivens ,main, criteria, intellec ,commit_type );
                        }  
                    }
                i=0;
                while(line!=null)
                    {   line=input.readLine(); 
                        st = new StringTokenizer(line," "); 
                        int p=Integer.parseInt(st.nextToken());
                        if(p==LUXURY)
                            {     int a=0,bb=0,c=0,d=0;
                                  while(st.hasMoreTokens())
                                    {   a = Integer.parseInt(st.nextToken());
                                        bb = Integer.parseInt(st.nextToken());
                                        c = Integer.parseInt(st.nextToken());
                                        d = Integer.parseInt(st.nextToken());            
                                    }
                                luxury_gift l= new luxury_gift(a,bb,c,d);
                                gt[i++]=new gift(l);
                            }
                        
                        else if(p==ESSENTIAL)
                            {   int a=0,bb=0;  
                                while(st.hasMoreTokens())
                                        {
                                                 a = Integer.parseInt(st.nextToken());
                                                 bb = Integer.parseInt(st.nextToken());
                                        }
                                essential_gift e= new essential_gift(a,bb);
                                gt[i++]=new gift(e);
                            }
                        else if(p==UTILITY)
                            {     int a=0,y=0,c=0,d=0;
                                  while(st.hasMoreTokens())
                                        {    a=Integer.parseInt(st.nextToken());
                                             y=Integer.parseInt(st.nextToken());
                                             c=Integer.parseInt(st.nextToken());
                                             d=Integer.parseInt(st.nextToken());
                                        } 
                                utility_gift u= new utility_gift(a,y,c,d);
                                gt[i++]=new gift(u);
                            }
                  
                    }
           } catch ( IOException e ) {} 
            finally {
              if ( input != null ) 
              {
                  try
                  { input.close();} 
                  catch (IOException ex) {
                      Logger.getLogger(read_input.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
                      }
        }
        
        
        
}
