// 00:21:01

import java.util.*;

class Solution {
    public long solution(long n) {
        char[] nArr = Long.toString(n).toCharArray();
        Arrays.sort(nArr);
        StringBuilder sb = new StringBuilder(new String(nArr));
        return Long.parseLong(sb.reverse().toString());



        // 풀이2 -> Collections.reverseOrder() 사용
        
        // String[] nArr = Long.toString(n).split("");
        // Arrays.sort(nArr, Collections.reverseOrder());
        // return Long.parseLong(String.join("", nArr));
    }
}
