package Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr =  {10, 10, 10};
        int n = arr.length;
        System.out.println(mergeSort(arr,0,n-1));
    }
    /*private static int count(int[] arr, int n){
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1; j < n ; j++){
                if(arr[j] < arr[i]){
                    cnt++;
                }
            }
        }

        return cnt;
    }*/
    private static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low < high){
            int mid = (low+high)/2;
            count += mergeSort(arr, low, mid-1);
            count += mergeSort(arr, mid+1, high);

            count+= merge(arr, low, high,mid);
            
        }
        return count;
    }
    private static int merge(int[] arr, int low, int high, int mid){
        int cnt = 0;
        int i = low;
        int j = mid+1;

        while(i<=mid && j <=high){
            if(arr[i] <= arr[j]){
                i++;
                
            }
            else{
                j++;
                cnt += high-i;  
            }
        }
       
        return cnt;
    }
}
