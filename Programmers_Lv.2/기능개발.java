import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer, Integer> map = new TreeMap<>();
        int duration = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int tmp = (100 - progresses[i]) % speeds[i] == 0 ?
                (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            
            if (i != 0 && duration > tmp) tmp = duration;
            
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            duration = tmp;
        }
        
        int[] answer = new int[map.size()];
        int i = 0;
        
        for (int key : map.keySet()) {
            answer[i] = map.get(key);
            i++;
        }
        
        return answer;
    }
}
