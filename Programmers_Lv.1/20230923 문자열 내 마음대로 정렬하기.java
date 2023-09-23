// 00:25:09

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
                // n번째 인덱스 글자가 같으면 전체 문자열 오름차순 정렬(사전순)
                if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                
                // n번째 인덱스 글자로 정렬
                return o1.charAt(n) - o2.charAt(n);
            });
        
        return strings;
    }
}
