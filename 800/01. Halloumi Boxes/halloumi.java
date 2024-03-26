import java.util.*;
public class halloumi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if(k>1) System.out.println("Yes");
            else {
                boolean nonDec = true;
                for (int j = 1; j < n; j++) {
                    if(arr[j] < arr[j-1]) {
                        System.out.println("No");
                        nonDec = false;
                        break;
                    }
                }

                if(nonDec) System.out.println("Yes");
            }
        }

        sc.close();
    }
}