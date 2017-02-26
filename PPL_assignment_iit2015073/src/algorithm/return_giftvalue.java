/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import dataitem.essential_gift;
import data_structures.gift;
import dataitem.luxury_gift;
import dataitem.utility_gift;

/*To find the price of a gift and return it , Used as an auxilliary class to help in sorting the gifts according to their prizes*/
public class return_giftvalue {
    
    private static final int  LUXURY =  6;
    private static final int  ESSENTIAL= 7;
    private static final int  UTILITY = 8;
     
    public  int val(gift gt)
        {
            if(gt.type==LUXURY)
                        {   luxury_gift l = (luxury_gift) gt.g;
                            return l.price;
                        }
                if(gt.type==ESSENTIAL)
                        {  essential_gift l = (essential_gift) gt.g;
                            return l.price;
                        }
               else 
               if(gt.type==UTILITY)
                        {  utility_gift l= (utility_gift) gt.g;
                            return l.price;
                        }
                return 0;
                
                
}
    
     public String strval(gift gt)
        {
            if(gt.type==LUXURY)
                        {   luxury_gift l = (luxury_gift) gt.g;
                            return "LUXURY";
                        }
                if(gt.type==ESSENTIAL)
                        {  essential_gift l = (essential_gift) gt.g;
                            return "ESSENTIAL";
                        }
               else 
               if(gt.type==UTILITY)
                        {  utility_gift l= (utility_gift) gt.g;
                            return "UTILITY";
                        }
        return null;
                
                
        }}                

