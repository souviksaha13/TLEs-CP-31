// brute-force solution

import java.util.Scanner;

public class dontTryToCount {
    static boolean contains(String x, String s, int n, int m) {
        if(n < m) return false;

        for(int i=0; i<=n-m; i++) {
            if(x.substring(i, i+m).equals(s)) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();
            int ans = 0;

            while(n < 40 && !contains(x, s, n, m)) {
                ans++;
                x = x + x;
                n = n + n;
            }

            if(n >= 40) System.out.println(-1);
            else System.out.println(ans);
        }

        sc.close();
    }
}