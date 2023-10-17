// Question-5:
//Finding GCD between two numbers using recursion :
package AD1.Assignment2_2241019588;
import java.util.*;
public class Question5 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" is : "+findGCD(a,b));  
    }
    public static int findGCD(int x,int y)
    {
        if(y==0)
            return x;
        return (findGCD(y, x%y));
    }
}
/*Pseudocode :
* enter a nonnegative number n
* Create a Fucntion FindGCD()
    if(y==0)
            return x
        return (findGCD(y, x%y))
*print findGCD()
*/