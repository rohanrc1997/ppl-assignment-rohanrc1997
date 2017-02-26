/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import data_structures.boy;
import data_structures.girl;
import dataitem.essential_gift;
import data_structures.gift;
import dataitem.luxury_gift;
import dataitem.utility_gift;

/*It is used to print the randomly generated data set into the input.txt file*/
public class print_util {
    
    private static final int CHOOSY = 0;
    private static final int NORMAL = 1;
    private static final int DESPERATE = 2;
    private static final int MISER = 3;
    private static final int GENEROUS=4;
    private static final int GEEKS = 5;
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    print_util(boy b[], girl g[], gift gt[]) throws IOException 
    {   
       
        BufferedWriter output = null;
        String el = System.getProperty("line.separator");
        String sp=" ";
        try {
            
            
            File file = new File("input.txt");
            output = new BufferedWriter(new FileWriter(file));
            
                    output.write(b.length   +sp+
                                 g.length   +sp+
                                 gt.length  +el);
            
            for(boy b1 : b)
                {
                    output.write(b1.name         +sp+ 
                                 b1.budget       +sp+ 
                                 b1.attractivens +sp+ 
                                 b1.intell_lvl   +sp+ 
                                 b1.min_attrct   +sp+
                                 b1.commit_type  +el); 
                }
            output.write("bbreak"+el);
            
            for(girl g1 :g )
                {   
                    output.write(g1.name         +sp+ 
                                 g1.main_budget  +sp+ 
                                 g1.attractivens +sp+ 
                                 g1.intell_lvl   +sp+ 
                                 g1.criteria     +sp+
                                 g1.commit_type  +el); 
                    
                }
            output.write("gbreak"+el);
            
            for(gift gi : gt)
                {   
                    if(gi.type==LUXURY)
                    {   
                            luxury_gift l= (luxury_gift)gi.g;
                            output.write( "6(LUXURY) "+
                                          l.price              +sp+ 
                                          l.value              +sp+ 
                                          l.luxury_rating      +sp+ 
                                          l.difficulty_obtain  +el );
                    }
                
                    else if(gi.type==ESSENTIAL)
                    {       
                            essential_gift e=(essential_gift)gi.g;
                            output.write(   "7(ESSENTIAL) "+
                                            e.price         +sp+ 
                                            e.value         +el );
                            
                    }
                
                    else if(gi.type==UTILITY)
                    {
                            utility_gift u=(utility_gift)gi.g;
                            output.write( "8(UTILITY) "+
                                          u.price         +sp+
                                          u.value         +sp+
                                          u.utility_class +sp+
                                          u.utility_value +el);
                    }
                }
            } catch ( IOException e ) {
        } finally {
          if ( output != null ) 
          {
            output.close();
          }
                  }
    }



}
