import java.util.*;
public class DeleteRepeatelement 
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
        int[] newArray=removeDuplicates(arr,n);
        System.out.println("After removing all repeated element :");
        for(int i=0;i<newArray.length;i++)
            System.out.print(newArray[i]+" ");
    }        
    public static int[] removeDuplicates(int[] array,int n) 
    {
        boolean[] repeated = new boolean[n];
        int norepeat = 0;
        for (int i = 0; i < n; i++) 
        {
            if (!repeated[i]) 
            {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) 
                    {
                        repeated[j] = true;
                    }
                }
                norepeat++;
            }
        }
        int[] uniqueArray = new int[norepeat];
        int index = 0;
        for (int i = 0; i < n; i++) 
        {
            if (!repeated[i]) 
            {
                uniqueArray[index++] = array[i];
            }
        }
        return uniqueArray;
    }
}
