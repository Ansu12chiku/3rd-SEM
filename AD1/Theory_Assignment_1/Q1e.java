package AD1.Theory_Assignment_1;
import java.util.*;
public class Q1e
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();  
        int reverse=0;
        while(n!=0)
        {
            reverse=reverse*10+n%10;
            n=n/10;
        }
        System.out.println("Digits is :"+reverse);
    }    
}
