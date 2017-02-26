/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

/*Girl Data Structure*/
public class girl {
    
    private static final int CHOOSY = 0;
    private static final int NORMAL = 1;
    private static final int DESPERATE = 2;
    
    public String name;
    public int attractivens;
    public int main_budget;
    public int criteria;
    public int intell_lvl;
    public int commit_type;
    
    public girl(String a,int b,int c, int d,int e,int f)
    {  this.name=a;
       this.attractivens=b;
       this.main_budget=c;
       this.criteria=d;
       this.intell_lvl=e;
       this.commit_type=f;
    }
    
   
    
}
