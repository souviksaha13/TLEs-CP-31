import java.util.Scanner;

public class coverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            String str = sc.next();
            int maxCnt = 0;
            int cnt = 0;
            int total = 0;
            
            for(int i=0; i<n; i++) {
                if(str.charAt(i) == '#') {
                    maxCnt = Math.max(maxCnt, cnt);
                    cnt = 0;
                }
                else {
                    total++;
                    cnt++;
                }
            }

            maxCnt = Math.max(maxCnt, cnt);

            if(maxCnt > 2) System.out.println(2);
            else System.out.println(total);
        }

        sc.close();
    }
}
