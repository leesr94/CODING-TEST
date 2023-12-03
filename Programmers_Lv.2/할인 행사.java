import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        List<String> list;
        int answer = 0;
        
        for (int i = 0; i < discount.length - 9; i++) {
            list = Arrays.asList(Arrays.copyOfRange(discount, i, i + 10));
            int buy = 0;
            
            for (int j = 0; j < want.length; j++) {
                if (Collections.frequency(list, want[j]) == number[j]) buy++;
                else break;
            }
            
            if (buy == want.length) answer++;
        }
        
        return answer;
    }
}
