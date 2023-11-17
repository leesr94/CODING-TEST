import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        int cnt = 1;
        int[] answer = { 0, 0 };
        
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i])) break;
            else if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) break;
            else {
                list.add(words[i]);
                cnt++;
            }
        }
        
        if (cnt != words.length) {
            answer[0] = cnt % n + 1;
            answer[1] = cnt / n + 1;
        }
        
        return answer;
    }
}
