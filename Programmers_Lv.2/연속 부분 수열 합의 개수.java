import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] elements) {
        int[] arr = IntStream.concat(IntStream.of(elements), IntStream.of(elements)).toArray();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            
            for (int j = i; j < i + elements.length; j++) {
                sum += arr[j];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
