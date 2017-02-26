/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.geeks;
import data_structures.generous;
import data_structures.miser;
import data_structures.couple;
import data_structures.gift;

/*To perform gifting among all couples*/
public class perform_gift {
    
    private static final int MISER = 3;
    private static final int GENEROUS=4;
    private static final int GEEKS = 5;
    
    void do_gift(couple cmtnt[], gift gt[])
        {   sort_class v=new sort_class();
            v.sort(gt);
            int n=cmtnt[0].arr_size;
            
            for(int i=0; i<n; i++)
                {
                    if(cmtnt[i].b.commit_type==MISER)
                        {
                            miser m=new miser();
                            m.miser_gift(gt, cmtnt[i]);
                        }
                    else
                    if(cmtnt[i].b.commit_type==GENEROUS)
                        {
                            generous g=new generous();
                            g.generous_gift(gt, cmtnt[i]);
                        }
                    else
                    if(cmtnt[i].b.commit_type==GEEKS)
                        {
                            geeks k= new geeks();
                            k.geeks_gift(gt, cmtnt[i]);
                        }
                       
                }
        }
}
