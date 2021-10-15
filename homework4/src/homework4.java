import java.util.Scanner;
public class homework4 {
    static int gcd(int m, int n) {
        if(m == 0)
            return m;
        else if(m % n == 0)
            return n;
        else {
            return gcd(n, m%n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(m+"과 "+n+"의 최대공약수: "+gcd(m,n));
        sc.close();
    }
}
