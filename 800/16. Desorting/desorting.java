import java.util.Scanner;

public class desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int minDif = Integer.MAX_VALUE;
            int a = sc.nextInt();

            for (int i = 1; i < n; i++) {
                int b = sc.nextInt();
                int dif = b - a;
                minDif = Math.min(minDif, dif);
                a = b;
            }
            minDif++;
            int ans = 0;

            if(minDif <= 0) System.out.println(ans);
            else {
                ans = minDif/2;
                if(minDif%2 != 0) ans++;

                System.out.println(ans);
            }
        }

        sc.close();
    }
}
