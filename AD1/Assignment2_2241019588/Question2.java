package AD1.Assignment2_2241019588;
import java.util.*;
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
            arr[i]=obj.nextInt();
        System.out.println("The Minimun is "+Min(arr,n));
        System.out.println("The Max is "+Max(arr,n));  
    }
    public static int Min(int[] a,int n)
    {
        if(n == 1) 
            return a[0]; 
          
        return Math.min(a[n-1], Min(a, n-1));
    }
    public static int Max(int[] a,int n)
    {
        if(n == 1) 
            return a[0]; 
          
        return Math.max(a[n-1],Max(a, n-1));
    }
}
