import java.util.Scanner;

public class goalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 0; i < n-1; i++) {
                sum += sc.nextInt();
            }

            System.out.println(-1 * sum);
        }

        sc.close();
    }
}
