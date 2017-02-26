/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package dataitem;

/*Used to represent a utility gift entity*/
public class utility_gift {
    
    public int utility_value;
    public int utility_class;
    public int value;
    public int price;
    
    public utility_gift (int a, int b, int c, int d)
        {
            this.utility_value=c;
            this.utility_class=d;
            this.price=a;
            this.value=b;
        }
}
