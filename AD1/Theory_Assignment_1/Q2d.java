package AD1.Theory_Assignment_1;
import java.util.*;
public class Q2d 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n =obj.nextInt();
        int[] binary=new int[40];
        int index=0;
        while(n!=0)
        {
            binary[index++]=n%2;
            n=n/2;
        }
        for(int i=index-1;i>=0;i--)
            System.out.print(binary[i]);
    }
}
