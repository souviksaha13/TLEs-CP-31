import java.util.Scanner;

public class walkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int ans = 0;
            if(d < b) {
                System.out.println(-1);
                continue;
            } else {
                int dif = d-b;
                ans += dif;
                a += dif;
                b += dif;
            }

            if(a < c) {
                System.out.println(-1);
                continue;
            } else {
                ans += (a-c);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
