import java.util.*;
public class insertionsort
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
        Insertion(arr);
        System.out.println("After using insertion sort the array is :");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+"  ");
    }
    public static void Insertion(int []a)
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
}
/*Pseudocode:
 * create an array of size n
 *for j=1 to n-1
 *  key=a[j]
 *  i=j-1
 *  while i>0 and a[i]>key
 *    a[i+1]=a[i]
 *    i=i-1
 *    end while  
 *  a[i+1]=key 
 * end for
 */
