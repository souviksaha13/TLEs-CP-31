import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n%2 == 0) System.out.println("YES");
            else {
                if(k%2 == 0) System.out.println("NO");
                else if(k > n) System.out.println("NO");
                else System.out.println("YES");
            }
        }

        sc.close();
    }
}
