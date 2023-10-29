// 00:51:14

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];          // 메일 발송
        Map<String, Set<String>> map = new HashMap<>();  // 해당 유저를 신고한 id 목록
        Map<String, Integer> rmap = new HashMap<>();     // 유저가 신고당한 횟수
        
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            rmap.put(id_list[i], i);
        }
        
        for (String s : report) {
            String u = s.split(" ")[0];
            String r = s.split(" ")[1];
            
            map.get(r).add(u);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            Set<String> mail = map.get(id_list[i]);
            
            if (mail.size() >= k) {
                for (String u : mail) answer[rmap.get(u)]++;
            }
        }
        
        return answer;
    }
}
