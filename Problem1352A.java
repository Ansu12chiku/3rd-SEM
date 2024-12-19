import java.util.*;
public class Problem1352A {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int j=0;j<n;j++)
            arr[j]=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            count=0;
            int x=arr[i];
            List<Integer> ans=new ArrayList<>();
            int mul=1;
            while(x!=0){
                int rem=x%10;
                if(rem!=0){
                    ans.add(rem*mul);
                    count++;
                }
                mul*=10;
                x/=10;
            }
            System.out.println(count);
            for (int j:ans)
                System.out.print(j+" ");
            System.out.println();
        }

    }
}
