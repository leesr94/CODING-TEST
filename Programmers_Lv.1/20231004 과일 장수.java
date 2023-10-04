// 00:38:31

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;

        if (score.length < m) return 0;

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % m == 0) answer += arr[i] * m;
        }

        return answer;
    }
}



// 오름차순 정렬 - 실행속도 향상
/*
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        
        if (score.length < m) return 0;
        
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }
        
        return answer;
    }
}
*/
