package Strings;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
    private static String countAndSay(int n){
        if(n == 1) {
            return "1";
        }
        String str = countAndSay(n-1);

        StringBuilder ans = new StringBuilder();
        int count = 1 ;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                ans.append((count)).append(str.charAt(i-1));
                count = 1;
            }
            else{
                count ++;
            }
        }
        ans.append((count)).append(str.charAt(str.length()-1));
        return ans.toString();
    }
}
