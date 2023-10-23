package AD1.Theory_Assignment_1;
import java.util.*;
public class Q1a 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
            System.out.println("Sum is :"+(-1*n/2));
        else
            System.out.println("Sum is : "+(n/2+1));
    }    
}
