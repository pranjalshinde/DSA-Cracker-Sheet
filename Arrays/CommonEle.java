package Arrays;

public class CommonEle {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int n1 = A.length, n2 = B.length, n3 = C.length;

        int i = 0 , j = 0 , k = 0;
        int dup = 0;
        while(i < n1 && j < n2 && k < n3){
            if(A[i]==B[j] && A[i] != dup){
               if(C[k] == A[i]){
                   dup = A[i];
                   System.out.println(A[i]+" ");
               }
            }
            if(A[i] <= B[j]){
                if(A[i]<= C[k]){
                   
                    i++;
                }
                else{
                    k++;
                }
            }
            else{
                j++;
            }
            
        }
    }
}
