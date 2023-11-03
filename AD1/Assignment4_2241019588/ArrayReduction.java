import java.util.*;
public class ArrayReduction 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        while (true)
        {
            int smallest = Smallest(arr);
            int count = Reduction(arr, smallest);
            if (count == 0) {
                System.out.println(count + " corresponds to [0] ");
                break;
            }
            print(arr, count);
        }
    }
    public static int Smallest(int[] a) 
    {
        for (int i = 1;; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) 
                    return i;
            }
        }
    }
    public static int Reduction(int[] a, int x) 
    {
        int c = 0;
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = a[i] - x;
            if (a[i] > 0)
                c++;
        }
        return c;
    }
    public static void print(int[] a, int count) {
        System.out.print(count + " corresponds to [");
        for (int i = 0; i < a.length; i++)
            if (a[i] > 0)
                System.out.print(a[i] + ",");
        System.out.println("]");
    }
}
