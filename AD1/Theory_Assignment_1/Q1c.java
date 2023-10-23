package AD1.Theory_Assignment_1;
import java.util.*;
public class Q1c{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(IsPrime(n));
    }
    public static boolean IsPrime(int x)
    {
        for(int i=2;i<=x;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}
