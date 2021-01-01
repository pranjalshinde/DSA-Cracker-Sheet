package SearchingAndSorting;

public class SquareRoot {
    private static int squareRoot(int n){
        if( n == 0 || n == 1) return 0;

        int i = 1;
        int sq = 1;

        while(sq < n){
            i++;
            sq = i * i;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int n = 16;

        System.out.println(squareRoot(n));
    }
}
