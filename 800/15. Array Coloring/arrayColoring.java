import java.util.Scanner;

public class arrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int odds = 0;

            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if(val%2 != 0) odds++;
            }

            if(odds%2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }

        sc.close();
    }
}
