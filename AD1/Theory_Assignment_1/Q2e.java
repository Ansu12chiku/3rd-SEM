package AD1.Theory_Assignment_1;
import java.util.*;
public class Q2e {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean possible=false;
        for(int i=2;i<=n/2;i++)
        {
            if(IsPrime(n-i) && IsPrime(i))
            {
                System.out.println("yes " +(n-i)+" "+i);
                possible=true;
                break;
            }
        }
        if(possible==false)
            System.out.println("NO");
    }
    public static boolean IsPrime(int x)
    {
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
