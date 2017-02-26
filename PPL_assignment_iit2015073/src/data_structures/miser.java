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
public class miser {
    
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public void miser_gift(gift[] gt, couple cp)
   {   
        int i;
        return_giftvalue gv=new return_giftvalue();
        
       for(i=0;i<gt.length;i++)
       {    
          
            cp.gift_recieve(gt[i]);
            
             if(cp.price_sum >= cp.g.main_budget) 
                    break;
               
       }
       
       
       cp.calc_girl_hapiness();
       cp.calc_boy_hapiness();
       cp.calc_compability();
       cp.calc_hapiness();
              
    }
       
   }
    

