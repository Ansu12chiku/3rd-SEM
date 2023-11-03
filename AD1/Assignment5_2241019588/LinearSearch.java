import java.util.*;
public class LinearSearch 
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
        for (int i = 0; i < n; i++)
            if(arr[i]== key)
            {
                found=true;
                break;
            }
        System.out.println("Element present in the array : "+found);
    }
}
