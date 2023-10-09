// 00:17:53

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 0; i < number; i++) {
            int cnt = 0;
            
            for (int j = 1; j <= (int) Math.sqrt(i + 1); j++) {
                if ((i + 1) % j == 0) {
                    if ((i + 1) / j == j) cnt -= 1;
                    cnt += 2;
                }
            }
            
            answer += (cnt > limit) ? power : cnt;
        }
        
        return answer;
    }
}
