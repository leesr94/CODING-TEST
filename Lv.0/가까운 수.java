class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100;
        int tmp = 0;
        
        for (int i : array) {
            tmp = Math.abs(n - i);
            if (tmp < min) {
                min = tmp;
                answer = i;
            }
            if (tmp == min && i < answer) {
                answer = i;
            }
        }
        
        return answer;
    }
}
