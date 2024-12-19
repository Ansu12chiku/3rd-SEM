import java.util.*;
public class Problem263A {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[][]=new int[5][5];
        for(int m=0;m<5;m++)
            for(int n=0;n<5;n++)
                arr[m][n]=obj.nextInt();
        int row=0,col=0;
        loop:
        for(row=0;row<5;row++){
            for (col=0;col<5;col++){  
             if(arr[row][col]==1){
                break loop;
             }
            }
        }   
        int rowoperation=Math.abs(2-row);
        int coloperartion=Math.abs(2-col);
        System.out.println((rowoperation+coloperartion));
    }
}
