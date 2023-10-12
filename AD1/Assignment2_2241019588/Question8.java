package Assignment2;

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
        if(x==a.length)
            return a.length;
        if(!search(a,x,0))
            return x;
        return Missing(a, x+1);        
    }
     public static boolean search(int[] a,int x,int i)
     {
        if(a[i]==x-1)
            return true;
        if(i==a.length-1)
            return false;
        return search(a,x+1,i+1);  
     } 
}
