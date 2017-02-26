/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package utilities;

import algorithm.return_giftvalue;
import data_structures.couple;
import data_structures.gift;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

/*This utility class logs the output to the log.txt file for every event occurance along with a timestamp*/
public class log_util {
    
        private static final int  LUXURY =  6;
        private static final int  ESSENTIAL= 7;
        private static final int  UTILITY = 8;
    
        public void log_init() throws FileNotFoundException, IOException
        {
            File f=new File("log.txt");
            FileOutputStream bw= new FileOutputStream(f,false);
            bw.close();
        }
        
        
        
        public void log_util_stdout(gift gt, couple cp) throws IOException
            {   
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String el = System.getProperty("line.separator");
                String sp=" ",tp;
                return_giftvalue r= new return_giftvalue();
                if(gt.type==LUXURY)
                    tp="LUXURY";
                else if(gt.type==ESSENTIAL)
                    tp="ESSENTIAL";
                else
                    tp="UTILITY";
                
                    System.out.println(timestamp.toString()+
                                       " : Gift Exchange: "+
                                          cp.b.name       +" -> "+
                                          cp.g.name       +sp+
                                          tp              +sp+
                                          r.val(gt)       );
                         
                  
                     }
                
            
        
        public void log_util_alloc(couple c) throws IOException
            {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                BufferedWriter output = null;
                String el = System.getProperty("line.separator");
                String sp=" ";
                
                try {
                         File file = new File("log.txt");
                         output = new BufferedWriter(new FileWriter(file,true));
                         
                         output.write( timestamp.toString()+
                                       " : Couple Created: "+
                                       c.b.name            +sp+
                                       c.g.name            +el);
                         
                    } catch ( IOException e ) {
                    } finally {
                             if ( output != null ) 
                             {
                               output.close();
                             }
                     }
            }

        
        public void log_util_gift(gift gt, couple cp) throws IOException
            {   
                this.log_util_stdout(gt, cp);
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                BufferedWriter output = null;
                String el = System.getProperty("line.separator");
                String sp=" ",tp;
                return_giftvalue r= new return_giftvalue();
                
                if(gt.type==LUXURY)
                    tp="LUXURY";
                else if(gt.type==ESSENTIAL)
                    tp="ESSENTIAL";
                else
                    tp="UTILITY";
                
                try {
                         File file = new File("log.txt");
                         output = new BufferedWriter(new FileWriter(file,true));
                         
                         output.write(timestamp.toString()+
                                       " : Gift Exchange: "+
                                          cp.b.name       +" -> "+
                                          cp.g.name       +sp+
                                          tp              +sp+
                                          r.val(gt)       +el);
                         
                    } catch ( IOException e ) {
                    } finally {
                             if ( output != null ) 
                             {
                               output.close();
                             }
                     }
                
            }
        
        
         
}
