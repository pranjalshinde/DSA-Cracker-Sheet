package Matrix;

public class RowWithMax1 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 0}};
        int row = matrix.length;
        int col = matrix[0].length;

        //Brute force approach
        //Time complexity ; O(n^2)
        
       /*  int max = 0;
        int r = -1;
        for(int i = 0 ; i < row; i++){
            int cnt = 0;
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == 1){
                    cnt++;
                }
                if(max < cnt){
                    max = cnt;
                    r = i;
                }
            }
        }*/
        System.out.println(rowMax1(matrix, row, col)); 
    }
    private static int rowMax1(int[][] matrix, int row, int col){
        int pos = -1;
        int idx = 0;
        
/* 
//Time complexity : O(nlogm)
        for(int i = 0 ; i < row ; i++){
            idx = first(matrix[i],0,col-1);
            
            if(idx != -1 && max < col-idx){
                max = col-idx;
                pos = i;
            }
        } */

        idx = first(matrix[0], 0, col-1);
        if(idx == -1) idx = col-1;
        for(int i = 1; i < row; i++){
            while(idx>=0 && matrix[i][idx] == 1){
                idx--;
                pos = i;
            }
        }
        //Time complexity : O(n+m)

        return pos;
    }
    private static int first(int[] arr, int start, int end){
        if(start <= end){
            int mid = start+ (end-start)/2;
            if((mid == 0 || arr[mid-1] == 0) && arr[mid] ==1){
                return mid;
            }
            else if(arr[mid] == 0){
                return first(arr, mid+1, end);
            }
            else{
                return first(arr, start, mid-1);
            }
        }
        return -1;
    }
}
