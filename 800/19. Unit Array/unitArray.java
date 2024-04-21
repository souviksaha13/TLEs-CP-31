import java.util.Scanner;

public class unitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int pos = 0, neg = 0;

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                if(val == 1) pos++;
                else neg++;
            }

            int ans = 0;

            if(neg > pos) {
                int dif = (neg - pos) + 1;
                ans += dif/2;
                neg -= ans;
            }

            if(neg%2 != 0) ans++;

            System.out.println(ans);
        }

        sc.close();
    }
}
