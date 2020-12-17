package Arrays;

public class Stock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int n = arr.length;
        System.out.println(buySell(arr, n));
    }
    private static int buySell(int[] arr,int n){
        int profit = 0;
        if(n <=0) return 0;
        int buy = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            profit = Math.max(arr[i]- buy, profit);
            
        }
        return profit;
    }
}
