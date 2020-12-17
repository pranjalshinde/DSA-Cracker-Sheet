package Arrays;

import java.math.BigInteger;

public class LargeFact {
    public static void main(String[] args) {
        int n = 10000;
        BigInteger fact = new BigInteger("1");

        for(int i = 2 ; i <= n ;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

    }
}