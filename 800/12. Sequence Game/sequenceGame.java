import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class sequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            Set<Integer> idx = new HashSet<>();

            for (int i = 0; i < n; i++) {
                ls.add(sc.nextInt());
            }

            for(int i=1; i<n; i++) {
                int val = ls.get(i);
                if(val < ls.get(i-1)) {
                    idx.add(i);
                }
            }

            System.out.println(n + idx.size());

            for(int i=0; i<n; i++) {
                int val = ls.get(i);
                System.out.print(val + " ");
                if(idx.contains(i)) System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
