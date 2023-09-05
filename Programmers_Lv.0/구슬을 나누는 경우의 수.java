import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger bigB = BigInteger.valueOf(balls);
        BigInteger bigS = BigInteger.valueOf(share);
        
        BigInteger bigMul = fact(bigB.subtract(bigS)).multiply(fact(bigS));
        
        return fact(bigB).divide(bigMul);
    }
    
    public static BigInteger fact(BigInteger n) {
        if (n.intValue() == 0) return BigInteger.ONE;
        return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
}
