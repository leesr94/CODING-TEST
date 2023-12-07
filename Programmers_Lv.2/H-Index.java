import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] citations) {
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        int answer = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= i) break;
            else answer++;
        }
        
        return answer;
    }
}
