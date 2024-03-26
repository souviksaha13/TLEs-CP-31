import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class doremysPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();

            for(int i=0; i<n; i++) {
                int val = sc.nextInt();
                mp.put(val, mp.getOrDefault(val, 0) + 1);
            }

            if(mp.size() == 1) System.out.println("Yes");
            else if(mp.size() > 2) System.out.println("No");

            else {
                int[] val = new int[2];
                int k = 0;

                for(Map.Entry<Integer, Integer> m : mp.entrySet()) {
                    val[k++] = m.getValue();
                }

                if(Math.abs(val[0]-val[1]) < 2) System.out.println("Yes");
                else System.out.println("No");
            }
        }

        sc.close();
    }
}
