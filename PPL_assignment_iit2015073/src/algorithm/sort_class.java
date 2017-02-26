/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.couple;
import data_structures.gift;

/*Contains Methods To sort the gift and couples based on different criterias*/
public class sort_class {
    
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    void sort( gift gt[] )
    {      
         return_giftvalue gv=new return_giftvalue();
         int n = gt.length;  
         gift temp;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(  gv.val(gt[j-1]) >  gv.val(gt[j]) )  
                          {     
                                 temp = gt[j-1];  
                                 gt[j-1] = gt[j];  
                                 gt[j] = temp;  
                          }  
                 }
        
       }
    }
    
    void sort_happy(couple c[])
    {
         int n = c[0].arr_size;  
         couple temp;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(  c[j-1].hapiness <  c[j].hapiness )  
                          {     
                                 temp = c[j-1];  
                                 c[j-1] = c[j];  
                                 c[j] = temp;  
                          }  
                 }
        
       }
    }
    
    void sort_comp(couple c[])
    {        
            int n = c[0].arr_size;  
            couple temp;  
            for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++)
                     {  
                              if(  c[j-1].compability >  c[j].compability )  
                              {     
                                     temp = c[j-1];  
                                     c[j-1] = c[j];  
                                     c[j] = temp;  
                              }  
                     }

           }
        
    }
}
