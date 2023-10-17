// Question-7 :
//Computing nth power of a number using recursion:
package AD1.Assignment2_2241019588;
import java.util.*;
public class Question7 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=obj.nextInt();
        System.out.println("Enter the power");
        int p=obj.nextInt();
        System.out.println(n+" power of "+p+" is : "+findPower(n,p));  
    }
    public static int findPower(int n,int p)
    {
        if(p==0)
            return 1;
        return n*(findPower(n, p-1));
    }
}
/*Pseudocode :
* enter a nonnegative number n
* enter the power
* 
* Create a Fucntion findPower()
    if(p==0)
            return 1
        return n*(findPower(n, p-1))
*print  findPower()
*/
