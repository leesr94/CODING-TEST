import java.util.*;

class Solution {
    public int solution(int n, int k) {
        List<Long> list = new ArrayList<>();
        int answer = 0;
        
        for (String t : Integer.toString(n, k).split("0")) {
            if (t.length() == 0 || t.equals("1")) continue;
            list.add(Long.parseLong(t));
        }
        
        for (long l : list) {
            int tmp = 0;
            
            for (int i = 2; i <= Math.sqrt(l); i++) {
                if (l % i == 0){
                    tmp++;
                    break;
                }
            }
            
            if (l == 2 || tmp == 0) answer++;
        }
        
        return answer;
    }
}
