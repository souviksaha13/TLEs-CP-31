import java.util.Scanner;

public class twoPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();

            if((a==b && b==n) || ((a+b)<(n-1))) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
}
