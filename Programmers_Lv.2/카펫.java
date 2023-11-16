import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        List<Integer> list = new ArrayList<>();
        int num = brown + yellow;
        
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) list.add(i);
        }
        
        int[] answer = { 0, 0 };
        
        // (answer[0] - 2) * (answer[1] - 2) == yellow 판별
        for (int i = 0; i < list.size(); i++) {
            if ((num / list.get(i) - 2) * (list.get(i) - 2) == yellow) {
                answer[0] = num / list.get(i);
                answer[1] = list.get(i);
            }
        }
        
        return answer;
    }
}
