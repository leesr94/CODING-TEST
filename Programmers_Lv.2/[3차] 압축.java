import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 26; i++) {
            map.put((char)(i + 'A') + "", i + 1);
        }
        
        int idx = 0;
        
        while (idx < msg.length()) {
            String w = "";
            
            while (idx < msg.length()) {
                if (!map.containsKey(w + msg.charAt(idx))) break;
                else w += msg.charAt(idx);
                idx++;
            }
            
            list.add(map.get(w));
            
            if (idx < msg.length()) map.put(w + msg.charAt(idx), Collections.max(map.values()) + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
