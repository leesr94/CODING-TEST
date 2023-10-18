// 00:39:46

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        // keymap의 문자들 중 인덱스가 가장 적은 수를 저장하기 위한 반복문
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            
            int min = 100;
            for (String s : keymap) {
                if (s.indexOf(ch) == -1) continue;
                min = Math.min(min, s.indexOf(ch));
                map.put(ch, min + 1);
            }
        }
        
        // targets의 문자와 keymap의 문자를 비교하기 위한 반복문
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (!map.containsKey(targets[i].charAt(j))) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += map.get(targets[i].charAt(j));
            }
        }
        
        return answer;
    }
}
