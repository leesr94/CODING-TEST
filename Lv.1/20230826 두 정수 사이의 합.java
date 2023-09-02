// 00:09:32

class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;
        
        long answer = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        
        return answer;


        // 실행속도 ↓ - 등차수열의 합
//      long start = Math.min(a, b);
//      long end = Math.max(a, b);
//      return (start + end) * (end - start + 1) / 2;
    }
}
