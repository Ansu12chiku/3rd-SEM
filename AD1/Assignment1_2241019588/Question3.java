// Question-3:
//Rotating array By k position using an iterative approach:
package AD1.Assignment1_2241019588;
import java.util.*;
public class Question3 
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
        System.out.println("Enter k :");
        int k=obj.nextInt();
        k=k%n;
        for(int i=1;i<=k;i++)
        {
            int temp=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        System.out.println("The Rotated array is : ");
        for (int i = 0; i <n; i++)
            System.out.println(arr[i]+" ");  
    }
   
}
