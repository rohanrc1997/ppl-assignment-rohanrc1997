/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package dataitem;

/*Used to represent a luxury gift entity*/
public class luxury_gift {
    public int luxury_rating;
    public int difficulty_obtain;
    public int price;
    public int value;
    
    public luxury_gift(int a, int b, int c, int d)
        {
            this.luxury_rating=c;
            this.difficulty_obtain=d;
            this.price=a;
            this.value=b;
        }
}
