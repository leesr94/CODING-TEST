// 00:23:56

import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int a = 0; a < commands.length; a++) {
            int i = commands[a][0] - 1;		// 시작 인덱스
            int j = commands[a][1] - 1;		// 끝 인덱스
            int k = commands[a][2] - 1;		// 찾을 인덱스
            
            // 임시 int배열 생성하여 array에서 일부 자르기
            int[] tmp = IntStream.range(i, j + 1).map(idx -> array[idx]).sorted().toArray();
            answer[a] = tmp[k];
        }
        
        return answer;
    }
}
