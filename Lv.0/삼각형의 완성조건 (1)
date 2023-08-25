import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
        int add = 0;
        int answer = 0;
        
        for (int i = 0; i < sides.length; i++) {
            max = (max <= sides[i]) ? sides[i] : max;
            add += sides[i];
        }
        
        answer = (max < (add - max)) ? 1 : 2;
        
        return answer;
    }
}