// 00:37:42

// Hash 사용 X - 효율성↓
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        return participant[participant.length - 1];
    }
}



// HashMap 사용 - 효율성↑
/*
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String answer = "";
        
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) answer = entry.getKey();
        }
        
        return answer;
    }
}
*/
