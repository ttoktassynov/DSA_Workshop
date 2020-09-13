package Searching;

public class PeakIndex {
    public static void main(String [] args) {
        System.out.println(new PeakIndex().findPeak(new int [] {3,5,3,2,0}));
    }
    public int findPeak(int [] a){
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;


            if ((m >= 0 && a[m] > a[m - 1]) && (m < a.length && a[m] > a[m + 1])) {
                return m;
            }
            else if (m > l && a[m] < a[m - 1]) {
                r = m;
            }
            else{
                l = m + 1;
            }
        }
        return -1;
    }
}
