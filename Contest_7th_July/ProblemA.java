package Contest_7th_July;

import java.util.ArrayList;
import java.util.Scanner;

public class  ProblemA {
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while (t-- > 0) {
            int n = obj.nextInt();
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 1; i<= n; ++i) {
                ans.add(i *(i + 1));
            }
            for (int i = 0; i < n; ++i) {
            System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}
