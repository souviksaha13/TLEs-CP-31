import java.util.Scanner;

public class servalAndMochasArray {
    static int gcd(int a, int b) {
        return (b==0)? a : gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean isPossible = false;

            for(int i=0; i<n-1; i++) {
                for(int j=i+1; j<n; j++) {
                    int gcd = gcd(arr[i], arr[j]);
                    if(gcd <= 2) isPossible = true;
                }
            }

            if(isPossible) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
}
