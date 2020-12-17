package Arrays;

public class MinJumps {
    public static int main(String[] args) {
        int[] arr = {1,4,3,2,6,7};
        int n = arr.length;
        if(n==1 || n==0){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }
        int[] step = new int[n];

      
        for(int i = n-2; i >= 0 ; i--){
            if(i+arr[i] >= n-1){
                step[i] = 1;
            }
            else{
                int ele = arr[i];
                int min = Integer.MAX_VALUE;
                while(ele != 0 ){
                    if(step[i+ele] != -1){
                        min = Math.min(step[ele+i],min);
                    }
                   
                    ele--;
                }
                if(min == Integer.MAX_VALUE){
                    step[i] = -1;
                }
                else
                {
                    step[i] = min+1;
                }
                
            }
        }
       return step[0];
    }

//Time Complexity : O(n*max(arr[]))
//Space complexity : O(n)

//Solution 2 :

   /* private static int minjump(int[] arr, int n){
        if(n <= 1) return 0;
        if(arr[0] == 0)return -1;
        
        int jumps = 1;
        int step = arr[0];
        int maxreach = arr[0];

        for(int i = 1 ; i < n ; i++){
            if(i == n-1){
                return jumps;
            }
            maxreach = Math.max(maxreach,i+arr[i]);

            step--;

            if(step == 0){
                jumps++;
                if(i >= maxreach){
                    return -1;
                }
                step = maxreach - i;
            }
        }
        return -1;
    }*/
}

//Time complexity : O(n)
//Space Complexity : O(1)