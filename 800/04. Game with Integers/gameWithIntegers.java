import java.util.Scanner;

public class gameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int z = 0; z < t; z++) {
            int num = sc.nextInt();

            if(num%3 == 0) System.out.println("Second");
            else System.out.println("First");
        }

        sc.close();
    }
}
