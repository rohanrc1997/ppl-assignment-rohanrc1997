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

/*The Generic object of this class represents an arbitrary gift of any type*/
public class gift {
    
    private static final int  LUXURY =  6;
    private static final int  ESSENTIAL= 7;
    private static final int  UTILITY = 8;
    
    public Object  g=new Object();
    public int type;
    public int arr_size;
    
    public gift( luxury_gift l)
    { type=LUXURY;
      g=l;
    }
    
    public gift(essential_gift e)
    { type=ESSENTIAL;
      g=e;
    }
    
    public gift(utility_gift u )
    { type=UTILITY;
      g=u;
    }
}
