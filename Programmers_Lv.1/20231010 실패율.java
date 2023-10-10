// 00:29:11

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        int user = stages.length;   // 사용자 수
        int cnt = 0;                // 클리어하지 못한 사용자 수
        
        for (int i = 0; i < N; i++) {
            // 스테이지에 머물고 있는 사람 구하기
            for (int j = 0; j < stages.length; j++) {
                if ((i + 1) == stages[j]) cnt++;
            }
            
            // 스테이지에 도전한 사람 수가 0이면 해당 스테이지의 실패율은 0
            // 아닐 경우 클리어 못한 사용자 / 도전한 사용자 저장
            if (user == 0) map.put(i + 1, 0.0);
            else map.put(i + 1, (double)cnt / user);
            
            // 앞의 스테이지에서 머물고 있는 사람이 있다면 다음 스테이지 도전자수 차감
            if (cnt != 0) user -= cnt; cnt = 0;
        }
        
        // 실패율을 내림차순으로 정렬하기 위한 List 생성
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
