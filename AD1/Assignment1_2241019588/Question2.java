//Question-2:
//Find maximum and minimum in an array using an iterative approach:
package AD1.Assignment1_2241019588;
import java.util. *;
public class Question2 
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
        // Initialize variables to hold the maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] > max)
                max = arr[i]; // Update the maximum value
            if (arr[i] < min)
                min = arr[i]; // Update the minimum value
        }
        // Print the maximum and minimum values
        System.out.println("In the array Maximum value: " + max+" \nand Minimum value: " + min);               
    }
}
/*
 * Pseudocode :
 * Make an arrray of size n
 * Take Input in the array
 * for i = 1 to n- 1 do
     Check if the current element is greater than the current maximum
    if arr[i] > max 
    then
        max = arr[i] //Update the maximum value

    Check if the current element is less than the current minimum
    if numbers[i] < min then
        min = numbers[i] // Update the minimum value
    end if
end for
Print the maximum and minimum values
 */