import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int[] pack = IntStream.rangeClosed(1, 10)
                        .map(i -> IntStream.rangeClosed(1, i).reduce(1, (x, y) -> (x * y)))
                        .toArray();
        int answer = 0;
        
        for (int i = 0; i < pack.length; i++) {
            if (pack[i] <= n) answer = (i + 1);
        }
        
        return answer;
    }
}
