import java.util.Scanner;

public class jaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if(arr[0] == 1) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
