import java.util.*;
public class FirstRepeated 
{
     public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        System.out.println("First repeated element is :"+Repeat(arr));
    }
    public static int Repeat(int[] a)
    {
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[j]==a[i])
                    return a[i];
        return -1;
    }
}
