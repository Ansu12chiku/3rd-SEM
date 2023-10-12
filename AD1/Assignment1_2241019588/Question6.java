package AD1.Assignment1_2241019588;
import java.util.*;
public class Question6 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int[] arr=new int [n];//Creating an array of n size        
        System.out.println("enter the numbers in the array");
        for (int i = 0; i <n; i++)
            arr[i]=obj.nextInt(); //taking all input in the array
        for (int i = 0; i < arr.length; i++)  
            for (int j = i + 1; j < arr.length; j++)   
            {  
                int temp = 0;  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }
            int temp[] =new int[n];
        for (int i = 0,j=0,k=n-1; i <n; i++)
        {
            if(i%2==0){
                temp[i]=arr[k];
                k--;
            }
            else
            {
                temp[i]=arr[j];
                j++;
            }
        }
        System.out.println("new max min sort array is :");
        for (int i = 0; i <n; i++)
            System.out.println(temp[i]+ " ");  
    }
}
