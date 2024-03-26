import java.util.*;

public class lineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n+1];
            arr[0] = 0;

            for (int i = 0; i < n; i++) {
                arr[i+1] = sc.nextInt();
            }

            int ans = 2 * (x - arr[n]);

            for(int i=1; i<=n; i++) {
                ans = Math.max(ans, arr[i]-arr[i-1]);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
