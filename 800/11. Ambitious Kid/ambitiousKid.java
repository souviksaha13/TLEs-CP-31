import java.util.Scanner;

public class ambitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ans = Math.min(ans, Math.abs(val));
        }

        System.out.println(ans);

        sc.close();
    }
}
