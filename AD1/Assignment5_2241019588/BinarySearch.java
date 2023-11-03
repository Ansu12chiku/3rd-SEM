import java.util.*;
public class BinarySearch
{
 public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        boolean found=false;
         System.out.print("Enter search element :");
        int key = obj.nextInt();
        int s=0,e=n-1;
        while(s<= e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==key)
            {
                found=true;
                break;
            }
            if(arr[mid]<key)
                s=mid+1;
            if(arr[mid]>key)
                e=mid-1;
        }
        System.out.println("Element present in the array : "+found);
    }
}