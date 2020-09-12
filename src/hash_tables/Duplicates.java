package hash_tables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
    Set<Integer> hashSet = new HashSet<>();
    public static void main(String [] args) {
        new Duplicates().solve();
    }
    private void solve() {
        if (hasDuplicate()) {
            System.out.println("Has duplicates");
        }
        else {
            System.out.println("No duplicates");
        }
    }
    private boolean hasDuplicate() {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            if (hashSet.contains(x)){
                return true;
            }
            else{
                hashSet.add(x);
            }
        }
        return false;
    }
}
