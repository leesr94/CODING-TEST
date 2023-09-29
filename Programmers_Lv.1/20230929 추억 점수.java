// 00:29:18

// 삼중for문 사용
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (String s : map.keySet()) {
                    if (photo[i][j].equals(s)) answer[i] += map.get(s);
                }
            }
        }
        
        return answer;
    }
}

// containsKey() 사용
/*
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) sum += map.get(photo[i][j]);
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}
*/
