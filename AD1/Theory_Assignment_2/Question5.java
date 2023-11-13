package AD1.Theory_Assignment_2;
public class Question5 {


        public static int findKthLargest(int[] heap, int n, int k, int x) {
            int count = 0;
            int result = 0;
    
            for (int i = 0; i < n; i++) {
                if (heap[i] <= x) {
                    count++;
                    result = heap[i];
                }
    
                if (count == k) {
                    break;
                }
            }
    
            if (count < k) {
                return -1; // Not enough elements
            } else {
                return result;
            }
        }
    
        public static void main(String[] args) {
            int[] heap = {3, 1, 4, 2, 6, 5};
            int n = heap.length;
            int k = 10;
            int x = 3;
    
            int kthLargest = findKthLargest(heap, n, k, x);
    
            if (kthLargest != -1) {
                System.out.println("The " + k + "th largest element smaller than or equal to " + x + " is: " + kthLargest);
            } else {
                System.out.println("Not enough elements");
            }
        }
    
}
