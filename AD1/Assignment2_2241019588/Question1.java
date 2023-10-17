// Question-1:
//sum of n numbers in an array using recursion:
package AD1.Assignment2_2241019588;
import java.util.*;
public class Question1
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int[] arr=new int [n];//Creating an array of n size        
        System.out.println("enter the numbers in the array");
        for (int i = 0; i <n; i++)
            arr[i]=obj.nextInt();
        System.out.println("The sum is "+Sum(arr,n));  
    }
    public static int Sum(int[] arr,int n)
    {
        if(n<=0)
            return 0;
        return (Sum(arr,n-1)+arr[n-1]);
    }
}
/*pseudocode :
 * Make an arrray of size n
 * Take Input in the array
 * make a function sum()
 * if n<=0 
 *      rerturn 0
 *      return (sum(arr,n-1)+arr[n-1]);
 * print sum() as result
 */