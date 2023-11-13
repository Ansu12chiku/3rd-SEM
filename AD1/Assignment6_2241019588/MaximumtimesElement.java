package AD1.Assignment6_2241019588;
import java.util.*;
public class MaximumtimesElement 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
            int maxcount=0,maxelement=0;
        for (int i = 0; i < n; i++)
        {
            int count=0;
            int key=arr[i];
                for (int j = 0; j < n; j++)
                {
                    if(arr[j]== key)
                        count++;
                }
            if(count>maxcount)
            {
                maxcount=count;
                maxelement=arr[i];
            }
        }
        System.out.println("Maximum repeated is "+maxelement);
    }
}

