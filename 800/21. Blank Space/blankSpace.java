import java.util.Scanner;

public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int ans = 0, cnt = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if(val == 0) cnt++;
                else {
                    ans = Math.max(ans, cnt);
                    cnt = 0;
                }
            }

            ans = Math.max(ans, cnt);

            System.out.println(ans);
        }

        sc.close();
    }
}
