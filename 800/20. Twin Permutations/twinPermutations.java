import java.util.Scanner;

public class twinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int sum = n+1;
            int[] ans = new int[n];

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                ans[i] = sum - val;
            }

            for(int i=0; i<n; i++) {
                System.out.print(ans[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
