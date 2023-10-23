package AD1.Theory_Assignment_1;
public class Q2c 
{
    public static void main(String[] args) 
    { 

            int arr[] = { 2, 3, 4, 10, 40 };
            int n = arr.length;
            int x = 2;
            int position=-1;
            int l = 0, r = arr.length - 1;
            while (l <= r) 
            {
                int m = l + (r - l) / 2;
                if (arr[m] == x)
                {
                    position=m;
                    break;
                }
                if (arr[m] < x)
                    l = m + 1;
                else
                    r = m - 1;
            }
            if (position == -1)
                System.out.println("Element is not present in array");
            else
                System.out.println("Element is present at "
                                   + "index " + position);
    }
}    

