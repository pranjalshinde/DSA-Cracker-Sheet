public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "noon high it is";
        int[] longest = {0,1};
        for(int i = 1 ; i < str.length()-1; i++){
            int[] odd = getLongestPalindrome(str, i-1, i+1);
            int[] even = getLongestPalindrome(str,i,i+1);
    
            int currentlong[] = (odd[1] - odd[0]) > (even[1] - even[0])? odd : even;
            longest = (currentlong[1] - currentlong[0]) > (longest[1] - longest[0])? currentlong : longest;
        }
       System.out.println(str.substring(longest[0], longest[1]));
    }
    private static int[] getLongestPalindrome(String str, int leftIdx, int rigthIdx){
       while(leftIdx >= 0 && rigthIdx < str.length()){
           if(str.charAt(leftIdx) != str.charAt(rigthIdx)){
               break;
           }
           leftIdx--;
           rigthIdx++;
       }
       return new int[]{leftIdx+1, rigthIdx};
    
    }
}
