import java.util.Scanner;

public class buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int anna = 0, katie = 0;

            anna = katie = c/2;
            if(c%2 != 0) anna++;

            anna += a;
            katie += b;

            if(anna > katie) System.out.println("First");
            else System.out.println("Second");
        }

        sc.close();
    }
}
