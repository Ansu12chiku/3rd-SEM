import java.util.Scanner;

public class Problem785A {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans = 0;
        sc.nextLine();

        String T = "Tetrahedron";
        String C = "Cube";
        String O = "Octahedron";
        String D = "Dodecahedron";
        String I="Icosahedron";

        while (t-- >0) {
            String s = sc.nextLine();

            if (s.equals(T))
                ans+=4;
            else if (s.equals(C))
                ans+=6; 
            else if (s.equals(O))
                ans+=8; 
            else if (s.equals(D))
                ans+=12; 
            else if (s.equals(I))
                ans+=20; 
              
        }

        System.out.println(ans);
        sc.close();
    }
}
