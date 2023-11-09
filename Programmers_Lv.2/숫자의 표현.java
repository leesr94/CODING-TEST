class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지의 약수 중 홀수의 개수
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) answer++;
        }
        
        return answer;
    }
}
