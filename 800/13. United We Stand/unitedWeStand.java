import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class unitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            boolean allSame = true;
            boolean second = false;

            int[] arr = new int[n];
            arr[0] = sc.nextInt();

            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] != arr[i-1]) allSame = false;
            }

            if(allSame) {
                System.out.println(-1);
                continue;
            }

            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();

            Arrays.sort(arr);

            a.add(arr[0]);

            for(int i=1; i<n; i++) {
                if(arr[i] != arr[i-1]) second = true;

                if(second) b.add(arr[i]);
                else a.add(arr[i]);
            }

            System.out.println(a.size() + " " + b.size());

            for(int i=0; i<a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }

            System.out.println();

            for(int i=0; i<b.size(); i++) {
                System.out.print(b.get(i) + " ");
            }

            System.out.println();
        }
    
        sc.close();
    }
}
