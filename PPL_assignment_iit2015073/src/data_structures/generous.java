/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

import algorithm.return_giftvalue;


/*Boy Data Sub-Structure*/
public class generous {
     
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public void generous_gift(gift[] gt, couple cp)
   {   
        int i;
        return_giftvalue gv=new return_giftvalue();
        
       for(i=gt.length-1;i>=0;i--)
       {    
            
            if(cp.price_sum + gv.val(gt[i]) > cp.b.budget) 
                    break;
            
            cp.gift_recieve(gt[i]);
               
       }
       
       
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
    }
   
}
