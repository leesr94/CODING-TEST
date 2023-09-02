// 00:18:57

class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1) {
            if (num % 2 == 0) { 
                num /= 2;
                answer++;
                continue;
            }
            if (num % 2 != 0) {
                num = num * 3 + 1;
                answer++;
                continue;
            }
        }
        
        if (answer >= 500) return -1;
        
        return answer;
    }
}
