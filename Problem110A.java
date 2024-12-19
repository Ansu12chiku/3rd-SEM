import java.util.Scanner;

public class Problem110A {
    public static boolean isALuckyNumber(int n) {
        String str = Integer.toString(n);
        boolean flag1 = false;
        boolean flag2 = false;

        for (char c : str.toCharArray()) {
            if (c == '4' && !flag1) {
                flag1 = true;
            } else if (c == '7' && !flag2) {
                flag2 = true;
            }
        }
        return flag1 && flag2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n % 7 == 0 || n % 4 == 0 || isALuckyNumber(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
