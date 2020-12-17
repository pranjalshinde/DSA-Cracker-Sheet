package Arrays;

public class MaxProd {
    public static void main(String[] args) {
        int[] arr = {6,-3,-10,0,2};
        int n = arr.length;
        System.out.println(maxProduct(arr,n));

    }
    private static int maxProduct(int[] arr, int n){
        if(n == 0) return 0;
        int maxProduct = arr[0];
        int maxVal = arr[0];
        int minVal = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < 0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            maxVal = Math.max(arr[i], arr[i]*maxVal);
            minVal = Math.min(arr[i], arr[i]*minVal);

            maxProduct = Math.max(maxProduct, maxVal);

        }
        return maxProduct;
    }
}
