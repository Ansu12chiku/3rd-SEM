import java.util.*;
public class selectionsort
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
        Selection(arr);
        System.out.println("After using Selection sort the array is :");
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+"  ");
    }
    public static void Selection(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
}
/*Pseudocode:
 * create an array of size n
 *for i=0 to n-1
 *  min=i
 *  i=j-1
 *  for j=i+1 to n-1 do
 *        //Find the index of the ith smallest element
 *    if a[j]<a[min]
 *          min=j
 *    end if
 *  end for
 *  swap a[min] and a[i]
 * end for
 */