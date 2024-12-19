import java.util.Scanner;

public class Problem510A {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        boolean b=false;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0){
                for(int j=0;j<m;j++)
                    System.out.print("#");
                System.out.println();
            }
            else if(!b) 
            {
                for(int k=1;k<m;k++)
                System.out.print(".");
                    System.out.println("#");
                b=true;
            }
            else 
            {
                System.out.print("#");
                for(int k=1;k<m;k++)
                System.out.print(".");
                b=false;
                System.out.println();
            }
                
        }
    }
}
