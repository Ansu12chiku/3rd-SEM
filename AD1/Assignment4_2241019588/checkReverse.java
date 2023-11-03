import java.util.Scanner;
public class checkReverse 
{ 
     public static void main (String[] args) 
    { 
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array and elements :");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = obj.nextInt();
        if(checkSorted(arr, n)) 
            System.out.println("Yes");
        else
            System.out.println("No"); 
    }
    public static boolean checkSorted(int[] a, int n) 
    { 
        int x = -1,y=-1; 
        for (int i = 0; i<n-1; i++) 
        { 
            if (a[i] > a[i + 1]) 
            { 
                if (x == -1)  
                    x = i;
                y = i + 1; 
            } 
        }
        if (x != -1) 
        { 
            reverse(a,x,y); 
            for (int i = 0; i < n - 1; i++) 
                if (a[i] > a[i + 1])
                    return false; 
        }
        return true; 
    }
     public static void reverse(int[] a,int x,int y) 
    { 
        while(x<y) 
        { 
        int temp = a[x]; 
        a[x] = a[y]; 
        a[y] = temp; 
        x++; 
        y--; 
        } 
    }
} 
