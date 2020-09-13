package Searching;

import java.util.Scanner;

public class Sqrt {
    public static void main(String [] args) {
        new Sqrt().solve();
    }
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(sqrt(x));
    }
    public long sqrt(int x) {
        long l = 1;
        long r = x;

        while (l <= r) {
            long m = l + (r - l) / 2 ;
            if (m * m > x) {
                r = m;
            }
            else if (m * m <= x && (m + 1) * (m + 1) > x){
                return m;
            }
            else {
                l = m;
            }
        }

        return 0;
    }
}
