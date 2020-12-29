package SearchingAndSorting;

public class IndexValue {
    public static void main(String[] args) {
        int[] array = {15, 2, 45, 12, 7};
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == i+1){
                System.out.println(array[i]);
               
            }
        }
        
    }
}