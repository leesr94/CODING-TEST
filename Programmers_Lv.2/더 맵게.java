import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> priority = new PriorityQueue<>();
        int answer = 0;
        
        for (int i = 0; i < scoville.length; i++) {
            priority.add(scoville[i]);
        }
        
        while (priority.peek() < K) {
            if (priority.size() == 1) return -1;
            
            int min1 = priority.poll();
            int min2 = priority.poll();
            
            priority.add(min1 + (min2 * 2));
            answer++;
        }
        
        return answer;
    }
}
