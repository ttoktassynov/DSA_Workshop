package complete_search;

import java.util.Scanner;

import static java.lang.Integer.max;

public class FlippingGame {
    Scanner scanner;
    public static void main(String[] args) {
        new FlippingGame().go();
    }
    private void go() {
        int len;
        scanner = new Scanner(System.in);
        len = scanner.nextInt();
        int [] a = readValues(len);
        System.out.println(solve(a, len));
    }

    private int [] readValues(int len){
        int [] a = new int [len];
        for (int i = 0; i < len; ++i) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    private int solve(int [] a, int len) {
        int ans = 0, cur;
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < len; ++j){
                cur = 0;
                for (int k = 0 ; k < i; ++k){
                    if (a[k] == 1){
                        ++cur;
                    }
                }
                for (int l = j; l < len; ++l){
                    if (a[l] == 1){
                        ++cur;
                    }
                }
                for (int m = i; m < j; ++m){
                    if (a[m] == 0){
                        ++cur;
                    }
                }
                ans = max(ans, cur);
            }
        }
        return ans;
    }
}
