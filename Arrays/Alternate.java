package Arrays;

public class Alternate {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;
        alter(arr, n);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void alter(int[] arr, int n){
        int neg = 0;
        int pos = 0;

        for(int i = 0; i < n ; i++){
            
            if(arr[i] < 0 ){
                neg = 1;
            }
            else{
                pos = 1;
            }
        }
    }
}
