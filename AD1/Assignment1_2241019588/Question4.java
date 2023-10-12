// Question-4:
//Finding the laargest sum contiguous subarray using an iterative approach:
package AD1.Assignment1_2241019588;
import java.util.*;
public class Question4 
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
        // Initialize variables to hold the maximumsum value
        int maxSum = Integer.MIN_VALUE;
        int currSum = arr[0];
        for (int i = 0; i <= n - 1; i++) 
        {
            currSum=Math.max(arr[i], currSum+arr[i]);
            if (currSum > maxSum)
                maxSum = currSum;
    
        }
        System.out.println("The maximum sum is "+maxSum);     
    }    
}
/*
 *  * pseudocode :
 * Make an arrray of size n
 * Take Input in the array
 * Maxsum=arr[0] (Initialize MaxSum to the first element)
 * currentSum = arr[0] (Initialize currentSum to the first element)
 * for i = 1 to n- 1 do\
 *      Choose the maximum between the current element and the sum of the current element and currentSum
        currentSum = max(arr[i], currentSum + arr[i])
        Update maxSum if the currentSum is greater
        if (currSum > maxSum)
                maxSum = currSum;
*   Print maxSum
*/