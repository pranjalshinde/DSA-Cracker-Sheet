package Arrays;



public class MoreNbyK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;
        int max = 0;
        for(int i = 0 ;i < n ; i++){
            max = Math.max(max,arr[i]);
        }
        int[] count = new int[max+1];

        for(int i = 0 ;i < n ; i++){
            count[arr[i]]++;
        }
        for(int i = 0 ; i <= max ;i++){
            if(count[i] > (n/k)){
                System.out.print(i+" ");
            }
        }

    }
    //Another approach would be hashmap
    //Or sorting
}
