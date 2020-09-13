package complete_search;

public class Pieces {
    public static final int MAX = 4000;
    public static void main(String  [] args) {
        System.out.println(new Pieces().getMaxPieces(100, 10,3, 7));
    }
    public int getMaxPieces(int n, int a, int b, int c) {
        int res = 0;
        for (int i = 0; i <= (int)Math.ceil(n / a); ++i ) {
            for (int j = 0 ; j <= (int)Math.ceil(n / b); ++j) {
                int tmp = n - a * i - b * j;
                if ( tmp % c == 0){
                    res = Integer.max(res, i + j + tmp / c);
                }
            }
        }
        return res;
    }
}
