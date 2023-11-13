package AD1.Assignment6_2241019588;
import java.util.*;
public class FindtheMissingnumbers 
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
        for(int j=1;j<=n;j++)
        {
            boolean found=false;
            for(int k=0;k<n;k++)
            {
                if(arr[k]==j)
                {
                    found=true;
                }                
            }
            if(!found)
                System.out.print(j+" ");    
        }
    }
}
