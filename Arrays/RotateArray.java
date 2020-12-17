package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int k = 3;
        while( --k >= 0){
            cyclicRotation(arr, arr.length);
        }
        

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static void cyclicRotation(int[] arr, int n){
        int last = arr[n-1];
        for(int i = n-1 ; i >= 1 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
