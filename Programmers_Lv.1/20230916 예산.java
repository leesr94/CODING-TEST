// 00:12:59

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);		// 부서별 신청 금액 오름차순 정렬
        int answer = 0;
        
        for (int i : d) {
            if (budget < i) break;	// 신청금액이 남은 예산보다 많으면 줄 수 없으므로 break
            budget -= i;		// 예산에서 신청금액 차감
            answer++;			// 차감 가능한 신청금액은 카운트 증가
        }
        
        return answer;
    }
}
