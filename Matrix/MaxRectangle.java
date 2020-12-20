package Matrix;

public class MaxRectangle {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,0},
                        {1,1,1,1},
                        {1,1,1,1},
                        {1,1,0,0}};

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println(maxReact(matrix,row,col));
    }
    private static int maxReact(int[][] matrix, int row, int col){
        int area = 0;
        // int[][] dp = new int[row][col];

        return area;
    }

}
