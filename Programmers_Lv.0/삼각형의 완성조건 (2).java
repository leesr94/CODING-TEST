class Solution {
    public int solution(int[] sides) {
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        
        int result1 = max - min;
        int result2 = max + min;
        
        return result2 - result1 - 1;
    }
}
