import java.util.*;
public class Mergearray 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of first sorted array and elements :");
        int m = obj.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++)
            arr1[i] = obj.nextInt();
        System.out.print("Enter the size of second sorted array and elements :");
        int n = obj.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++)
            arr2[i] = obj.nextInt();
        for(int i=0;i<m;i++)
        {
            if(arr1[i]>arr2[0])
            {
                int swap=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=swap;
                for(int j=0;j<n-1;j++)
                {
                    if(arr2[j]>arr2[j+1])
                    {
                        int temp=arr2[j];
                        arr2[j]=arr2[j+1];
                        arr2[j+1]=temp;
                    }
                }
            }
        }
        print(arr1);
        print(arr2);
    }
    public static void print(int[] a) 
    {   
        System.out.println("");
        for (int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
}
