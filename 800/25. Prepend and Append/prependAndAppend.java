import java.util.Scanner;

public class prependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();

            int st = 0, end = n-1;

            while(st < end) {
                if((arr[st] == '0' && arr[end] == '1') || (arr[st] == '1' && arr[end] == '0')) {
                    n -= 2;
                    st++;
                    end--;
                }
                else break;
            }

            System.out.println(n);
        }

        sc.close();
    }
}
