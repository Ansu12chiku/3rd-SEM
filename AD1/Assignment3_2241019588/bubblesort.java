import java.util.*;
public class bubblesort
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n =obj.nextInt();
        int[] arr=new int[n]; 
        
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        Bubble(arr);
        System.out.println("After using Bubble sort the array is :");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+"  ");
    }
    public static void Bubble(int []a)
    {
        for(int j=1;j<a.length;j++)
        {
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }
}
/*Pseudocode:
 * create an array of size n
 *int i,j,k
 *  n=length(a)
 *  for j=i to n do
 *      for i=0 to n-1 do
 *    if a[i]>a[i+1]
 *      int temp=a[i];
        a[i+1]=a[i];
        a[i+1]=temp;
 *    end if
 *  end for
 * end for
 */