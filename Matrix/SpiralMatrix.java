package Matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                        {12, 13, 4},
                        {11, 14, 5},
                        {10, 15, 6},
                        {9,8,7}};
        int row = matrix.length;
        int col = matrix[0].length;
        spiralMatrix(matrix,row,col);
    }
    private static void spiralMatrix(int[][] matrix, int r, int c){
        int row_start = 0, row_end = r-1;
        int col_start = 0, col_end = c-1;

        while(row_start <= row_end && col_start <= col_end){
            for(int col = col_start; col <= col_end; col++){
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;
            for(int row = row_start; row <= row_end ; row++){
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;
            for(int col = col_end; col>= col_start; col--){
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;
            for(int row = row_end ; row >=row_start ; row--){
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
        }
    }
} 