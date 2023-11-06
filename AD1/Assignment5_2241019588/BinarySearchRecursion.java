import java.util.*;
public class BinarySearchRecursion 
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
        System.out.println("Element present in the array : "+Search(arr,key,0,n-1));
    }
    public static boolean Search(int[] a,int x,int l,int r)
    {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==x)
                return true;
            if (a[mid]>x)
                return Search(a,x,l,mid-1);
            if (a[mid]<x)
                return Search(a,x,mid+1,r);      
        
        }
        return false;
    }
}
