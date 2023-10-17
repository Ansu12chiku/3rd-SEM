// Question-7:
//nth Fiboacci number by using an iterative approach:
package AD1.Assignment1_2241019588;
import java.util.*;
public class Question8
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=obj.nextInt();
        int a=0,b=1,sum=1;
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("The "+n+"th fibonacci number is "+sum); 
    }
}
/*
 * Pseudocode :
 * enter a nonnegative number n
 * initialize a=0,b=1,sum=1
 * for i=2 to n-1 do
 *      sum=a+b
            a=b
            b=sum
        }
 * end for
 * print that sum 
 */
