// 00:36:31

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = (int)Arrays.stream(arr).filter(i -> i % divisor == 0).count();
        
        if (cnt == 0) return new int[] { -1 };
        
        return Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();



        // 실행속도 줄이기 - 스트림 생성 후 정렬
        //int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        //Arrays.sort(answer);
        //int cnt = (int)answer.length;
        
        //if (cnt == 0) return new int[] { -1 };
        
        //return answer;
    }
}
