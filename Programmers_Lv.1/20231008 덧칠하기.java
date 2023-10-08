// 00:33:42

class Solution {
    public int solution(int n, int m, int[] section) {
        int paint = section[0]; // section의 첫번째는 항상 칠함
        int answer = 1;         // 그러므로 칠하는 횟수는 최소 1번
        
        for (int i = 1; i < section.length; i++) {
            if (paint + m - 1 < section[i]) {
                answer++;
                paint = section[i];
            }
        }
        
        return answer;
    }
}
