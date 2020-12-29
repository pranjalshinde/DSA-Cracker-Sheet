package SearchingAndSorting;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,5,5,6,7,123,125};
        int x = 7;

        int i = 0;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println(-1);
        }
        for(i = arr.length-1; i >= 0; i--){
            if(arr[i] == x){
                System.out.println(i);
                break;
            }
        }
        if(i == arr.length){
            System.out.println(-1);
        }
    }
}
