// 00:06:00

import java.util.stream.*;

class Solution {
    public String solution(String s) {
        int[] arr = IntStream.range(0, s.split(" ").length)
                        .map(i -> Integer.parseInt(s.split(" ")[i])).sorted().toArray();
        StringBuilder sb = new StringBuilder();
        
        sb.append(arr[0]);
        sb.append(" ");
        sb.append(arr[arr.length - 1]);
        
        return sb.toString();
    }
}
