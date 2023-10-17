// Question-4:
//Generating nth Fibonacci numberusing recursion:
package AD1.Assignment2_2241019588;
import java.util.*;
public class Question4 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=obj.nextInt();
        System.out.println("The "+n+"th fibbonacci number is : "+Fibo(n));  
    }
    public static int Fibo(int x)
    {
        if(x == 0) 
            return 0;
        if(x == 1) 
            return 1; 
          
        return Fibo(x-1)+Fibo(x-2);
    }
}
/*Pseudocode :
* enter a nonnegative number n
* Create a Fucntion Fibo()
*   if(x == 0) 
            return 0
    if(x == 1) 
            return 1           
    return Fibo(x-1)+Fibo(x-2)
*/