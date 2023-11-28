import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        for (Integer key : map.keySet()) {
            pq.add(map.get(key));
        }
        
        while (k > 0) {
            if (pq.peek() > k) {
                pq.poll();
                answer++;
                break;
            } else {
                k -= pq.poll();
                answer++;
            }
        }
        
        return answer;
    }
}
