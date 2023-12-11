import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> list = new ArrayList<>();
        int answer = 0;
        
        if (cacheSize == 0) return cities.length * 5;
        
        for (String c : cities) {
            String tmp = c.toLowerCase();
            
            if (list.contains(tmp)) {
                list.remove(list.indexOf(tmp));
                answer++;
            } else {
                if (list.size() >= cacheSize) list.remove(0);
                answer += 5;
            }
            
            list.add(tmp);
        }
        
        return answer;
    }
}
