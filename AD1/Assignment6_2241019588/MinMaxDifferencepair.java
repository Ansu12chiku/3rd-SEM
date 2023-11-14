package AD1.Assignment6_2241019588;
import java.util.*;
public class MinMaxDifferencepair 
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
        getMaxMinDiff(arr);
    }
     public static void getMaxMinDiff(int[] A)
    {
        int maxdif=Integer.MIN_VALUE;
        int mindif=Integer.MAX_VALUE;
        int maxfirst=0,minfirst=0,maxsec=0,minsec=0;
        int n = A.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) 
            {
                int curdiff=Math.abs(A[j]-A[i]);
                if (curdiff>maxdif) 
                {
                   maxdif=curdiff;
                   maxfirst=A[i];
                   maxsec=A[j];
                }
                if (curdiff<mindif) 
                {
                   mindif=curdiff;
                   minfirst=A[i];
                   minsec=A[j];
                }
            }
        } 
        System.out.println("MinDifference Pair is [ "+minfirst+" , "+minsec+"]");
        System.out.println("MAXDifference Pair is [ "+maxfirst+" , "+maxsec+"]");
    }
}
