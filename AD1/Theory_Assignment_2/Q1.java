package AD1.Theory_Assignment_2;
import java.util.*;
public class Q1 {
        public static int findSmallestElement(int[] A) {
            int low = 0;
            int high = A.length - 1;
    
            while (low < high) 
            {
                int mid = (low + high) / 2;
    
                if (A[mid] < A[mid + 1]) 
                {
                    high = mid;
                } else
                {
                    low = mid + 1;
                }
            }    
            return A[low];
        }
    
        public static void main(String[] args) {
            int[] A = {100,99,80,75,40,30,60,88,95,110,125,127,128,180,190,200};
            int smallest = findSmallestElement(A);
            System.out.println("The smallest element is: " + smallest); 
    }
}
