package Arrays;
import java.util.*;
public class MinimizeArray {
    public static void main(String[] args) {
        int k = 2;
        int n = 4;
        int[] arr = {1,5,8,10};
        System.out.println(minimize(arr, k , n));
    }
    public static int minimize(int[] arr, int k, int n){
        if(n==1) return 0;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int big = arr[n-1] - k;
        int small = arr[0] + k ;
        if(big < small){
            int temp = big;
            big = small;
            small= temp;
        }
        for(int i = 1 ; i < n-1 ;i++){
            int subtract = arr[i] - k ;
            int add = arr[i] + k;
            if(subtract >= small || add <= big){
                continue;
            }
            if(big-subtract <= add-small){
                small = subtract;
            }
            else{
                big = add;
            }
        }
        return Math.min(ans, big-small);
    }
}
