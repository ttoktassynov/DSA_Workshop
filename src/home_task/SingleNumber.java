package home_task;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String [] args) {
        new SingleNumber().solve();
    }
    public void solve() {
        System.out.println(singleNumber(readValues()));
    }
    public int singleNumber(int [] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; ++i) {
            ans ^= nums[i];
        }
        return ans;
    }
    public int [] readValues() {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

}
