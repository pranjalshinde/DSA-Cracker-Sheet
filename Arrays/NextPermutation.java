package Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        /*int i = n-2;
        while(i >=0 && arr[i+1] <= arr[i]){
            i--;
        }
        if(i >= 0){
            int j = n-1;
            while(j>=0 && arr[j] <= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);
        */
        nextPermutation(arr);
        for(int k = 0 ; k < n ; k++){
            System.out.println(arr[k]+" ");
        } 

    }
    private static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums,i+1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    /* private static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int[] arr, int start) {
        int i = start;
        int j = arr.length-1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    } */
}
