// 00:48:50

import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> list = new ArrayList<>();
        String answer = "";
        
        // skip에 있는 문자는 제외한 알파벳 list
        for (int i = 0; i < 26; i++) {
            if (skip.contains((char)('a' + i) + "")) continue;
            list.add((char)('a' + i));
        }
        
        // 문자열 s의 각 문자보다 index만큼 뒤에 있는 문자를
        // 위의 알파벳 list에서 구하기
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = list.indexOf(ch) + index;
            
            if (idx >= list.size()) idx = idx % list.size();
            answer += list.get(idx);
        }
        
        return answer;
    }
}
