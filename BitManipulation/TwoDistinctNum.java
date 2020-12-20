package BitManipulation;

public class TwoDistinctNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};
        int xorsum = 0;
        for(int i = 0; i < arr.length; i++){
            xorsum ^= arr[i];
        }
        int pos = 0;
        int temp = xorsum;
        while(!setBit(temp,0)){
            pos++;
            temp = temp >> 1;
        }
        int num1 = 0;
        int num2 = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(!setBit(arr[i], pos)){
                num1 ^= arr[i];
            }
        }
        num2 = xorsum ^ num1;
        System.out.println(num1+" "+num2);
        

    }
    private static boolean setBit(int n, int pos){
        return ((n & (1 << pos)) != 0);
    }
}
