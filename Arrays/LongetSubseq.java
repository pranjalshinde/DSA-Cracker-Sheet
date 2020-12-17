package Arrays;

import java.util.HashMap;

public class LongetSubseq {
    public static void main(String[] args) {
        int[] arr = {1,9,3,10,4,20,2};
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i < n ; i++){
            map.put(arr[i],1);
        }
      
        int max = 0;
      
        for(int i = 0 ; i < n ; i++){
            if(!map.containsKey(arr[i]-1)){
                int j = arr[i];
                while(map.containsKey(j)){
                    j++;
                }
                max = Math.max(max, j-arr[i]);
            }
        }
        System.out.println(max);
    }
    
}
//Time Complexity : O(n)
//Space Complexity : O(n)