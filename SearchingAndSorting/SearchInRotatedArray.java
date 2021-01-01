package SearchingAndSorting;

public class SearchInRotatedArray {

    private static int search(int[] array, int left, int right,int target){
        if(left > right){
            return -1;
        }
        int mid = left + ((right - left)/2);
        if(array[mid] == target){
            return mid;
        }
        int leftidx = search(array, left, mid-1, target );
        if(leftidx == -1){
            return search(array, mid+1, right, target);
        }
        return leftidx;
    }
    public static void main(String[] args) {
        int[] array = {5,6,7,8,0,1,2,4,4};
        int target = 8;
        System.out.println(search(array,0,array.length-1, target));
    }

}