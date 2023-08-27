class Solution {
    public int solution(int hp) {
        int[] ant = { 5, 3, 1 };
        int answer = 0;
        
        for (int i : ant) {
            answer += (int)(hp / i);
            hp %= i;
        }
        
        return answer;
    }
}
