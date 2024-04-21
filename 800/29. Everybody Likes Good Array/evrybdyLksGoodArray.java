import java.util.Scanner;

public class evrybdyLksGoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int ans = 0;
            int val = sc.nextInt();
            boolean evenParity = (val%2 == 0)? true : false;

            for(int i=1; i<n; i++) {
                val = sc.nextInt();
                if(evenParity && val%2 == 0) ans++;
                else if(!evenParity && val%2 != 0) ans++;
                else if((evenParity && val%2 != 0) || (!evenParity && val%2 == 0)) 
                    evenParity = !evenParity;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
