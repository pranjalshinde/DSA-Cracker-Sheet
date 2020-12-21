public class Rotation {
    private static boolean areRotation(String str1, String str2){
        String concatString = str1+str1;
        return (str1.length() == str2.length() && concatString.indexOf(str2) != -1);
    }
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "CAB";
       
       /*  int k = 0;
        int flag = 0;
        int cnt = 0;
        for(int i = 0; i < concatString.length(); i++){
            if(k< str2.length() && concatString.charAt(i) == str2.charAt(k)){
                k++;
                cnt++;
            }
            else{
                cnt =0;
            }
            if(cnt == str2.length()){
                System.out.println("YES");
                flag = 1;
            }
        }
        
        if(flag == 0){
            System.out.println("NO");
        } */

        if(areRotation(str1, str2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}
