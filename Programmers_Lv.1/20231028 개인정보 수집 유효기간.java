// 00:33:44

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 오늘 날짜
        int days = Integer.parseInt(today.split("\\.")[0]) * 28 * 12
                    + Integer.parseInt(today.split("\\.")[1]) * 28
                    + Integer.parseInt(today.split("\\.")[2]);
        
        // 약관 종류
        Map<String, String> tm = new HashMap<>();
        
        for (String t : terms) {
            tm.put(t.split(" ")[0], t.split(" ")[1]);
        }
        
        
        // 유효기간이 지난 날짜 저장
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String s = privacies[i].split(" ")[0];
            int month = Integer.parseInt(tm.get(privacies[i].split(" ")[1])) * 28;
            int result = Integer.parseInt(s.split("\\.")[0]) * 28 * 12 
                        + Integer.parseInt(s.split("\\.")[1]) * 28 
                        + Integer.parseInt(s.split("\\.")[2]);
            
            if (result + month <= days) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
