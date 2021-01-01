//Time Complexity : O(n)

package SearchingAndSorting;

public class MinMax {
    static class Pair {
        int max;
        int min;
    }
    private static Pair getMinMax(int[] array, int left, int right){
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if(left == right){
            minmax.max = array[0];
            minmax.min = array[0];
            return minmax;
        }
        if(right == left+1){
            minmax.max = Math.max(array[left], array[right]);
            minmax.min = Math.min(array[left], array[right]);
            return minmax;
        }
       

        int mid = left + (right-left)/2;
        mml = getMinMax(array, left, mid);
        mmr = getMinMax(array, mid+1, right);

        minmax.max = Math.max(mml.max, mmr.max);
        minmax.min = Math.min(mml.min, mmr.min);

        return minmax;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,9,7,10,4,5,8};
        Pair minmax = getMinMax(array, 0 , array.length-1);

        System.out.println("min : "+minmax.min);
        System.out.println("max : "+minmax.max);
    }
}
