
import java.util.Scanner;
public class deleteduplicates 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        InsertionSort(arr);
        deleteDuplicates(arr);
        Print(arr);
        System.out.println("First repeated element is :"+Repeat(arr));
    }
    public static void InsertionSort(int []a)
    {
        for(int j=1;j<a.length;j++)
        {
            int k=a[j];
            int i=j-1;
            while(i>=0 && a[i]>k)
            {
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=k;
        }
    }
    public static void deleteDuplicates(int[] a)
    {
        for(int i=0,j=1;i<a.length-1;i++)
        {
            if(a[i]==a[j])
                
            int temp=a[j];

        }
           
    }
    public static void print(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
