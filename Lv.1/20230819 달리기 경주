// Lv.1 Java 달리기 경주

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> playerMap = new HashMap<String, Integer>();
        Map<Integer, String> rankMap = new HashMap<Integer, String>();
        
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i + 1);
            rankMap.put(i + 1, players[i]);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int callRank = playerMap.get(callings[i]);      // 호명된 선수의 현재 등수
            String prevName = rankMap.get(callRank - 1);    // 호명된 선수보다 앞의 선수
            
            playerMap.put(callings[i], callRank - 1);       // 호명된 선수 등수 변경
            playerMap.put(prevName, callRank);              // 앞의 선수 등수 변경
            
            rankMap.put(callRank - 1, callings[i]);         // 호명된 선수 등수 변경
            rankMap.put(callRank, prevName);                // 앞의 선수 등수 변경
        }
        
        for (int i = 0; i < players.length; i++) {
            answer[i] = rankMap.get(i + 1);
        }
        
        return answer;
    }
}
