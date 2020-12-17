package Matrix;
import java.util.*;

public class Median {
    public static void main(String[] args) {
        int[][] matrix = { {1,3,5}, {2,6,9}, {3,6,9} };
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println(median(matrix,row,col));
    }
    private static int median(int[][] matrix, int row, int col){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < row ; i++){
            if(matrix[i][0] < min){
                min = matrix[i][0];
            }
            if(matrix[i][col-1] > max){
                max = matrix[i][col-1];
            }
        }
        int desired = (row*col+1)/2;
        int cnt = 0;
       
        while(min < max){
            int get = 0;
            int count = 0;
            int mid = min + (max-min)/2;
            System.out.println("min "+min);
            for(int i = 0 ; i < row ; i++){
                get = Arrays.binarySearch(matrix[i], mid);
                if(get < 0){
                    get = Math.abs(get)-1;
                }
                else{
                    while(get < matrix[i].length && matrix[i][get] == mid){
                        get++;
                    }
                }
                count += get;
            }
            System.out.println("get "+get+" mid "+mid);
            if(count < desired){
                min = mid+1;
            }
            else{
                max = mid;
            }
            cnt ++;
        }
        System.out.println(cnt);
        return min;
    }
}
