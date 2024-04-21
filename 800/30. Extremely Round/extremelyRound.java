import java.util.*;

public class extremelyRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> round = new ArrayList<>();
        int num = 0, sum = 1;

        while(num < 1000000) {
            num += sum;
            if(num == (10*sum)) sum = num;
            round.add(num);
        }

        int n = round.size();

        for (int xx = 0; xx < t; xx++) {
            int val = sc.nextInt();
            int lo = 0, hi = n;

            while(lo <= hi) {
                int mid = (lo+hi)/2;
                if(round.get(mid) <= val) lo = mid+1;
                else hi = mid-1;
            }

            System.out.println(lo);
        }

        sc.close();
    }
}
