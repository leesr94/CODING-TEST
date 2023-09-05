import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int num, int k) {
        String[] numArr = Integer.toString(num).split("");
        int[] idx = IntStream.rangeClosed(1, numArr.length)
                        .filter(i -> numArr[i - 1].equals(k + "")).toArray();
        
        if (idx.length == 0) return -1;
        
        return idx[0];


        // 다른 사람 풀이
        //return ("-" + num).indexOf(k + "");
    }
}
