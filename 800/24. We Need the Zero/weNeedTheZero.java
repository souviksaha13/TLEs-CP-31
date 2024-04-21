import java.util.Scanner;

public class weNeedTheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int xx=0; xx<t; xx++) {
            int n = sc.nextInt();
            int xor = 0;

            for(int i=0; i<n; i++) {
                xor = xor ^ sc.nextInt();
            }

            if(n%2 != 0) System.out.println(xor);
            else if(xor != 0) System.out.println(-1);
            else System.out.println(0);
        }
        sc.close();
    }
}

// import java.util.Scanner;

// public class weNeedTheZero {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         for(int xx=0; xx<t; xx++) {
//             int n = sc.nextInt();
//             int[] ones = new int[9];
//             int[] zeros = new int[9];

//             for(int j=0; j<n; j++) {
//                 int val = sc.nextInt();
//                 int i=0;

//                 while(val != 0) {
//                     if(val%2 == 0) zeros[i++]++;
//                     else ones[i++]++;

//                     val /= 2;
//                 }
//             }

//             int ans = 0;
//             for(int i=0; i<9; i++) {
//                 if((ones[i]%2!=0) && (zeros[i]%2!=0)) {
//                     ans = -1;
//                     break;
//                 }
//                 else if((ones[i]%2 != 0) && (zeros[i]%2 == 0)) ans += (1<<i);
//             }

//             System.out.println(ans);
//         }

//         sc.close();
//     }
// }
