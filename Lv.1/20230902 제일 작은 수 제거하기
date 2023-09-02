// 00:18:06

import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = IntStream.of(arr).min().getAsInt();
        
        if (arr.length == 1) return new int[] { -1 };
        
        return IntStream.of(arr).filter(i -> i != min).toArray();
    }
}
