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
public class geeks {
    
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public void geeks_gift(gift[] gt, couple cp)
   {    
        int i,lux_index=0;
        return_giftvalue gv=new return_giftvalue();
        
       for(i=0;i<gt.length;i++)
       {    
            cp.gift_recieve(gt[i]);
            
             if(cp.price_sum >= cp.g.main_budget) 
                        break;
               
       }
    
         for(i=0;i<=gt.length;i++)
            if(gt[i].type==LUXURY)
                {       lux_index=i;  
                        break;
                }
         
         if(cp.b.budget-cp.price_sum>=gv.val(gt[lux_index]))
                cp.gift_recieve(gt[lux_index]);
         
         
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
    }
}
