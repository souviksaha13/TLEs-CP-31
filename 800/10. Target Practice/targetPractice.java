import java.util.Scanner;

public class targetPractice {
    static int points(int i, int j) {
        int val1, val2;
        if(i<5) val1 = i+1;
        else val1 = 10 - i;

        if(j<5) val2 = j+1;
        else val2 = 10 - j;

        return Math.min(val1, val2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int ans = 0;
            for(int i=0; i<10; i++) {
                String str = sc.next();
                for(int j=0; j<10; j++) {
                    char c = str.charAt(j);
                    if(c == 'X') ans += points(i, j);
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
