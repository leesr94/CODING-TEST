class Solution {
    public long solution(int n) {
        long answer = 0;
        long n1 = 1L;
        long n2 = 2L;
        
        if (n <= 2) return n;
        
        for (int i = 3; i <= n; i++) {
            answer = (n1 + n2) % 1234567;
            n1 = n2;
            n2 = answer;
        }
        
        return answer;
    }
}
