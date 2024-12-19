import java.util.*;

public class Problem723A {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x1=obj.nextInt();
        int x2=obj.nextInt();
        int x3=obj.nextInt();
        int arr[]={x1,x2,x3};
        Arrays.sort(arr);
        int ans=arr[2]-arr[0];
        System.out.println(ans);

    }
}
