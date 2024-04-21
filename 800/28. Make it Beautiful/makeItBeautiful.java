import java.util.Arrays;
import java.util.Scanner;

public class makeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ans = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if(n>1 && arr[0] == arr[n-1]) {
                System.out.println("NO");
                continue;
            }

            int st=0, end=n-1;
            boolean left = true;

            for(int i=0; i<n; i++) {
                if(left) ans[i] = arr[st++];
                else ans[i] = arr[end--];
                left = !left;
            }

            System.out.println("YES");
            for(int i=0; i<n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
