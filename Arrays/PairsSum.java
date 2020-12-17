package Arrays;

import java.util.HashMap;


public class PairsSum {
    public static void main(String[] args) {
        int[] arr = {1,5,3,1};
        int k = 6;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i = 0;  i< arr.length ; i++){
            if(map.get(k-arr[i]) != null){
                count += map.get(k-arr[i]);
            }
            if(k-arr[i] == arr[i]){
                count--;
            }
        }
        System.out.println(count/2);
    }
}
