package AD1.Assignment2_2241019588;
import java.util.Scanner;

public class Question8
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int[] arr=new int [n];//Creating an array of n size        
        System.out.println("enter the numbers in the array");
        for (int i = 0; i <n; i++)
            arr[i]=obj.nextInt();
        System.out.println("The Smallest missing positive no. is "+Missing(arr,1)); 
    }
    public static int Missing(int[] a,int x)
    {
        
        if(!search(a,0,a.length-1,x))
            return x;
        if(x==a.length)
            return x+1;
        return Missing(a, x+1);        
    }
     public static boolean search(int[] arr,int l,int r,int x)
     {
        if (r < l)
            return false;
 
        if (arr[l] == x)
            return true;
 
        if (arr[r] == x)
            return true;

        return search(arr,l+1,r-1,x);  
     } 
}
