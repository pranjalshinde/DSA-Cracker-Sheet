package Arrays;

import java.util.HashSet;

public class SubarrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 0 ,1 ,6};
        HashSet<Integer> set = new HashSet<>();
        int prefix = 0;
        int flag = 0;
        for(int i = 0; i < arr.length ; i++){
           prefix += arr[i];
           if(arr[0]==0 || prefix == 0 ||set.contains(prefix)){
               System.out.println("Yes");
               flag = 1;
               break;
           }
           set.add(prefix);

        }
        if(flag == 0){
            System.out.println("No");
        }
    }
}
