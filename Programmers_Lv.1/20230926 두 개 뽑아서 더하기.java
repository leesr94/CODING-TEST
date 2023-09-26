// 00:39:26

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
