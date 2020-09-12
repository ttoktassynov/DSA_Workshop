package hash_tables;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSums {
    int numbers [];
    Map<Integer, Integer> numbersMap = new HashMap<>();
    int len, target;
    public static void main(String [] args) {
        new TwoSums().solve();
    }
    public void solve() {
        numbers = readValues();
        int [] res = twoSums();
        System.out.println(res[0] + " " + res[1]);
    }
    public int [] readValues() {
        Scanner scanner = new Scanner(System.in);
        len = scanner.nextInt();
        target = scanner.nextInt();
        int [] a = new int [len];
        for (int i = 0; i < len; ++i) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public int [] twoSums() {
        for (int i = 0; i < len; ++i) {
            int complement = target - numbers[i];
            if (numbersMap.containsKey(complement)) {
                return new int [] {numbersMap.get(complement), i};
            }
            else {
                numbersMap.put(numbers[i], i);
            }
        }
        return new int []{-1, -1};
    }
}
