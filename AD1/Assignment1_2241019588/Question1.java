// Question-1:
//sum of n numbers in an array using an iterative approach:
package AD1.Assignment1_2241019588;
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
            arr[i]=obj.nextInt(); //taking all input in the array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i]; //Calculating the sum In the array       
        System.out.println("The sum of the numbers is: " + sum);  // Print the result
    }
}
/*pseudocode :
 * Make an arrray of size n
 * Take Input in the array
 * initialize sum=0
 * for i=0 to n-1 do
 *        sum=sum+arr[i]
 *        i=i+1
 * print sum as result
 */

