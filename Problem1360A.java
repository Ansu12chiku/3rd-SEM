import java.util.Scanner;

public class Problem1360A {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0)
        {
            int l=obj.nextInt();
            int b=obj.nextInt();
            int large=Math.max(l,b);
            int small=Math.min(l,b);
            if(large>2*small)
                System.out.println(large*large);
            else
                System.out.println(4*small*small);
        }
    }
}
