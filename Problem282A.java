import java.util.Scanner;

public class Problem282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 0;
        sc.nextLine();

        String s2 = "++X";
        String s3 = "X++";
        String s4 = "--X";
        String s5 = "X--";

        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();

            if (s1.equals(s2) || s1.equals(s3)) 
                x = x + 1;
            else 
                x = x - 1; 
        }

        System.out.println(x);
        sc.close();
    }
}
