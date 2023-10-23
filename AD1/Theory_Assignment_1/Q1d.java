package AD1.Theory_Assignment_1;
import java.util.*;
public class Q1d 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();  
        int count=0;
        while(n!=0)
        {
            count=count+1;
            n=n/10;
        }
        System.out.println("Digits is :"+count);
    }    
}
