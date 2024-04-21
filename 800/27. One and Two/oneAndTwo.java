import java.util.Scanner;

public class oneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int tCnt = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 2) tCnt++;
            }

            if(tCnt%2 != 0) {
                System.out.println(-1);
                continue;
            }

            int left = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] == 2) {
                    left++;
                    tCnt--;
                }
                if(left == tCnt) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        sc.close();
    }
}
