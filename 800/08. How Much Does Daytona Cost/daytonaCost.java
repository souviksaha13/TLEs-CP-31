import java.util.Scanner;

public class daytonaCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean ans = false;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if(val == k) ans = true;
            }

            if(ans) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}