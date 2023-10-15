// 00:30:17

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;       // 도난 당하지 않은 학생 수
        
        // 정렬 되어있다는 조건이 없기 때문에 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 도난 당했지만 여벌 체육복이 있는 학생
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = 0;    // 체육복있으므로 상관없는 값으로 변경
                    reserve[j] = 0; // 체육복을 빌려줄 수 X, 상관 없는 값으로 변경
                    break;
                }
            }
        }
        
        // 도난당한 학생이 빌릴 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 앞이나 뒷번호가 여벌 체육복이 있을 경우
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = 0; // 체육복을 빌려줘서 더이상 줄 수 X, 상관없는 값으로 변경
                    break;
                }
            }
        }
        
        return answer;
    }
}
