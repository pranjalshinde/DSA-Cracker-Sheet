package Matrix;

import java.util.PriorityQueue;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, 
                        {15, 25, 35, 45}, 
                        {27, 29, 37, 48}, 
                        {32, 33, 39, 50}};
        int row = matrix.length;
        int col = matrix[0].length;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                queue.add(matrix[i][j]);
            }
        }
        for(int i = 0 ; i < queue.size(); i++){
            System.out.print(queue.poll()+" ");
        }
        
        
    }
}
