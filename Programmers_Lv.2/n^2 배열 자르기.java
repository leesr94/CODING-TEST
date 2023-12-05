class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        for (int i = 0; i < answer.length; i++) {
            int row = (int)(left / n) + 1;
            int column = (int)(left % n) + 1;
            left++;
            
            answer[i] = Math.max(row, column);
        }
        
        return answer;
    }
}
