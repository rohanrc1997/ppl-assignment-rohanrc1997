/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package data_structures;

/*Boy Data Structure*/
public class boy {
    
    private static final int MISER = 3;
    private static final int GENEROUS=4;
    private static final int GEEKS = 5;
    
    public String name;
    public int attractivens;
    public int budget;
    public int min_attrct;
    public int intell_lvl;
    public int commit_type;
    
    public boy(String a,int b,int c, int d,int e,int f)
    {  this.name=a;
       this.attractivens=b;
       this.budget=c;
       this.min_attrct=d;
       this.intell_lvl=e;
       this.commit_type=f;
    }
}
