import java.math.BigInteger;
import java.util.Scanner;

public class Problem291A {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BigInteger x = obj.nextBigInteger();
        BigInteger temp = x;
        BigInteger rev = BigInteger.ZERO, rem;
        int count = 0;

        while (!temp.equals(BigInteger.ZERO)) {
            rem = temp.mod(BigInteger.TEN);
            if (rem.compareTo(BigInteger.valueOf(4)) > 0 && (!temp.equals(BigInteger.valueOf(9))) ) {
                rem = BigInteger.valueOf(9).subtract(rem);
            }
            rev = rev.multiply(BigInteger.TEN).add(rem);
            temp = temp.divide(BigInteger.TEN);
            count++;
        }
        

        BigInteger ans = BigInteger.ZERO;

        while (!rev.equals(BigInteger.ZERO)) {
            rem = rev.mod(BigInteger.TEN);
            ans = ans.multiply(BigInteger.TEN).add(rem);
            rev = rev.divide(BigInteger.TEN);
            count--;
        }

        while (count > 0) {
            ans = ans.multiply(BigInteger.TEN);
            count--;
        }

        System.out.println(ans);
        obj.close();
    }
}
