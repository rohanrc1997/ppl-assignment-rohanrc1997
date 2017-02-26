/* 
 * 
 *  IPPL430C Assignment
 *  @author  IIT2015073, Rohan Chaudhary 
 *  @version 25 Feb, 2017
 *  Prof. Rahul Kala
 */
package algorithm;

import data_structures.boy;
import data_structures.couple;
import data_structures.girl;
import java.io.IOException;
import utilities.log_util;

/* To allocate couples */

public class alloc_couple {
    
    private static final int ATTRACTIVE = 0;
    private static final int INTELLIGENT = 1;
    private static final int RICH = 2;
    
    public couple c[];
    public int size;
    
    
    void alloc_init(boy b[] , girl g[]) throws IOException
        {   
            c= new couple[g.length];
            int avl[]=new int[b.length];
            int i,j,k=0,tmp=0,ind=0;
            
            for(i=0;i<b.length;i++)
                avl[i]=1;
            
            log_util u=new log_util();
            
            for( i=0 ; i<g.length ; i++ )
                {   if(g[i].criteria==RICH)
                    { 
                        for(j=0; j< b.length;j++)
                        {   if(avl[j]!=0)
                            if(b[j].budget>=g[i].main_budget && b[j].budget>tmp )
                            {       ind=j;
                                    tmp=b[j].budget;
                            }
                            }     
                            if(avl[ind]==1)    
                            {    c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==INTELLIGENT)
                    { 
                        for(j=0; j< b.length;j++)
                        {   if(avl[j]!=0)
                            if(b[j].budget>=g[i].main_budget && b[j].intell_lvl>tmp )
                            {       ind=j;
                                    tmp=b[j].intell_lvl;
                            }
                            }    
                            if(avl[ind]==1)
                            {   c[k]=new couple(b[ind],g[i]);
                                u.log_util_alloc(c[k]);
                                k++;
                                avl[ind]=0;
                                tmp=0;
                            }
                    }
                    else if(g[i].criteria==ATTRACTIVE)
                        {   
                            for(j=0; j< b.length;j++)
                            {   if(avl[j]!=0)
                                if(b[j].budget>=g[i].main_budget && b[j].attractivens>tmp )
                                {       ind=j;
                                        tmp=b[j].attractivens;
                                }
                                }   
                                    if(avl[ind]==1)
                                    {   c[k]=new couple(b[ind],g[i]);
                                        u.log_util_alloc(c[k]);
                                        k++;
                                        avl[ind]=0;
                                    }
                        }
                }  
            for(i=0;i<k;i++)
                c[i].arr_size=k; 
        }
    
    
    
    public void print_couple()
    {   String sp="|";
        System.out.println("The allocated couples are as follows: ");
        System.out.println("|| BOY NAME | BOY BUDGET | GIRL NAME | GIRL BUDGET ||");
        for(int i=0; i<c[0].arr_size; i++)
             System.out.println( sp+sp+"  "+  c[i].b.name    +" "+sp+" "+
                                              c[i].b.budget  +" "+sp+" "+
                                              c[i].g.name    +" "+sp+" "+
                                              c[i].g.main_budget 
                                 +" "+sp+sp);

           
    }
}
