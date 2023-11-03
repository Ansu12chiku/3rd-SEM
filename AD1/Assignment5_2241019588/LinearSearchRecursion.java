package Assignment5;
import java.util.*;
public class LinearSearchRecursion 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        System.out.println("Element present in the array : "+Search(arr,key,0));
    }
    public static boolean Search(int[] a,int x,int i)
    {
        if(a[i]==x)
            return true;
        if (i==a.length)
            return false;
        
        return Search(a,x,i+1);
    }
    
}
