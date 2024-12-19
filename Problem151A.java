import java.util.Scanner;

public class Problem151A{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int l=obj.nextInt();
        int c=obj.nextInt();
        int d=obj.nextInt();
        int p=obj.nextInt();
        int nl=obj.nextInt();
        int np=obj.nextInt();
        int kl=k*l;
        int kln=(int)(kl/nl);
        int cd=c*d;
        int pnp=(int)(p/np);
        int min=(int)(Math.min(kln,((int)(Math.min(cd, pnp)))));
        int ans=(int)(min/n);
        System.out.println(ans);

    }
}