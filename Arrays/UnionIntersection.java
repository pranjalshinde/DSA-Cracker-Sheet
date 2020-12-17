package Arrays;
import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = union(arr1, arr2, n, m);
        for(int i = 0; i < arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> inter = intersect(arr1, arr2, n, m);
        for(int i = 0; i < inter.size();i++){
            System.out.print(inter.get(i)+" ");
        }
    }
    private static ArrayList<Integer> union(int[] arr1,int[] arr2,int n,int m){
        //int[] uni = new int[n+m];
        ArrayList<Integer> uni = new ArrayList<>();
        //int k = 0;
        for(int i = 0 ; i < n ; i++){
            uni.add( arr1[i]) ;
        }
        for(int i = 0 ; i < m ; i++){
            int flag = 0;
            for(int j = 0 ; j < n ; j++){
                if(uni.get(j) == arr2[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                uni.add(arr2[i]);
            }
        }
        return uni;
    }
    //Another approach is using hash set
    private static ArrayList<Integer> intersect(int[] arr1,int[] arr2,int n,int m){
        ArrayList<Integer> intersect = new ArrayList<>();
        for(int i = 0 ; i< n ; i ++){
            for(int j = 0 ; j < m ; j++){
                if(arr1[i] == arr2[j]){
                    intersect.add(arr1[i]);
                    break;
                }
            }
        }
        return intersect;
    }
    
}
