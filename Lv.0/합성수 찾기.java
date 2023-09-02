import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) list.add(j);
            }
            if (list.size() > 2) answer++;
            list.clear();
        }
        
        return answer;
    }
}
