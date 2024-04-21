import java.util.Scanner;

public class forbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int xx = 0; xx < t; xx++) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();

            if(k==1 && x==1) System.out.println("NO");
            else if(n%2 != 0 && k==2 && x==1) System.out.println("NO");
            else {
                System.out.println("YES");
                if(x==1) {
                    System.out.println(n/2);
                    for(int i=2; i<=n; i+=2) {
                        if(i==2 && (n%2 != 0)) {
                            System.out.print(3 + " ");
                            i++;
                        }
                        else System.out.print(2 + " ");
                    }
                }
                else {
                    System.out.println(n);
                    for(int i=1; i<=n; i++) {
                        System.out.print(1 + " ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}