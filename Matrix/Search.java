package Matrix;

public class Search {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,50}};
        int key = 10;
      
        System.out.println(searchMatrix(matrix,key));
    }
    private static boolean searchMatrix(int[][] matrix, int key){
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        int r = 0;
        int c = col-1;
        while(r < row && r >= 0 && c >=0 && c < col){
            if(matrix[r][c] == key){
                return true;
            }
            else if(matrix[r][c] > key){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}
