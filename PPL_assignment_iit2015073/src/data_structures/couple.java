/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

import dataitem.utility_gift;
import dataitem.essential_gift;
import dataitem.luxury_gift;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.log_util;

/*Couple Data Structure*/
public class couple {
    
    private static final int CHOOSY = 0;
    private static final int NORMAL = 1;
    private static final int DESPERATE = 2;
    private static final int MISER = 3;
    private static final int GENEROUS=4;
    private static final int GEEKS = 5;
    private static final int LUXURY =  6;
    private static final int ESSENTIAL= 7;
    private static final int UTILITY = 8;
    
    public int arr_size;
    public  boy b;
    public  girl g;
    public  long girl_happiness;
    public  long boy_happiness;
    public  long hapiness;
    public  double compability;
    public  long price_sum;
    public  long value;
      
      
    public  couple(boy bb, girl gg)
      {     
            this.b=bb;
            this.g=gg;
            this.boy_happiness=0;
            this.girl_happiness=0;
            this.price_sum=0;
      }
      
      
      
    public  void gift_recieve_choosy(gift gt)
     {      
            if(gt.type==LUXURY)
                    {   luxury_gift l = (luxury_gift) gt.g;
                        price_sum=price_sum+l.price;
                        value=value+2*l.value;
                    }
               else
            if(gt.type==ESSENTIAL)
                    {  essential_gift e = (essential_gift) gt.g;
                       price_sum+=e.price;
                       
                   
                    }
               else 
            if(gt.type==UTILITY)
                    {  utility_gift u= (utility_gift) gt.g;
                       price_sum+=u.price;
                    }
         
     }
      
      
      
    public  void gift_recieve_normal(gift gt)
     {      
            if(gt.type==LUXURY)
                    {   luxury_gift l = (luxury_gift) gt.g;
                        price_sum=price_sum+l.price;
                        value=value+l.value;
                    }
               else
            if(gt.type==ESSENTIAL)
                    {  essential_gift e = (essential_gift) gt.g;
                       price_sum+=e.price;
                       value=value+e.value;
                       
                   
                    }
               else 
            if(gt.type==UTILITY)
                    {  utility_gift u= (utility_gift) gt.g;
                       price_sum+=u.price;
                       value=value+u.value;
                    }
            
         
     } 
      
      
      
    public void gift_recieve_desperate(gift gt)
     {      
            if(gt.type==LUXURY)
                    {   luxury_gift l = (luxury_gift) gt.g;
                        price_sum=price_sum+l.price;
                      
                    }
               else
            if(gt.type==ESSENTIAL)
                    {  essential_gift e = (essential_gift) gt.g;
                       price_sum+=e.price;
                     
                       
                   
                    }
               else 
            if(gt.type==UTILITY)
                    {  utility_gift u= (utility_gift) gt.g;
                       price_sum+=u.price;
                      
                    }
            
            
         
     } 
      
       
      
    public void gift_recieve(gift gt)
     {  if(g.commit_type==CHOOSY)
            gift_recieve_choosy(gt);
        
        else if ((g.commit_type==NORMAL))
            gift_recieve_normal(gt);
      
        else
            gift_recieve_desperate(gt);
        
        log_util u=new log_util();
        
        try {
            u.log_util_gift(gt, this);
        } catch (IOException ex) {
            Logger.getLogger(couple.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
     
     
     
    public double calc_girl_hapiness()
     {       
             if(g.commit_type==CHOOSY)
                       this.girl_happiness=(long) (Math.log(price_sum)+value);
               
        
             else if ((g.commit_type==NORMAL))
                       this.girl_happiness=price_sum+value;
      
             else
                       this.girl_happiness=(long) Math.exp(price_sum);
             
            return this.girl_happiness;
         
     }
     
     
     
    public double calc_boy_hapiness()
     {
            if(b.commit_type==MISER)
                    this.boy_happiness=(b.budget-g.main_budget);
            
            else if (b.commit_type==GENEROUS)
                    this.boy_happiness=this.girl_happiness;
            
            else
                    this.boy_happiness=g.intell_lvl;
            
            return this.boy_happiness;
     }
     
     
     
    public double calc_hapiness()
     {      hapiness=girl_happiness+boy_happiness;
            return hapiness;
     }
     
     
    public double calc_compability()
     {      this.compability=(Math.abs(b.attractivens-g.attractivens)+Math.abs(b.budget-g.main_budget)+Math.abs(b.intell_lvl-g.intell_lvl));
            return compability;
     }
     
  
   
     
}
