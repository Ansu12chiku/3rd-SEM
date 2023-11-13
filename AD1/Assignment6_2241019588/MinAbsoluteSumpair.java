package AD1.Assignment6_2241019588;
import java.util.*;
public class MinAbsoluteSumpair {
     public static void main(String[] args)
    {
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n =obj.nextInt();
        int[] arr=new int[n]; 
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt(); 
        getMaxMinDiff(arr);
    }
     public static void getMaxMinDiff(int[] A)
    {
        int mindif=Integer.MAX_VALUE;
        int firstElement=0,secondelement=0;
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++) 
            {
                int curdiff=Math.abs(A[j]+A[i]);
                if (curdiff<mindif) 
                {
                   mindif=curdiff;
                   firstElement=A[i];
                   secondelement=A[j];
                }
            }
        }
        System.out.println("MinAbsoluteSum Pair is [ "+firstElement+" , "+secondelement+"]");
    }
}
