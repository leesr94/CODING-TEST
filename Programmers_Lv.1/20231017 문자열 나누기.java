// 00:20:37

class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (cnt == 0) {
                x = s.charAt(i);
                answer++;
            }
            
            if (x == s.charAt(i)) cnt++;
            else cnt--;
        }
        
        return answer;
    }
}
