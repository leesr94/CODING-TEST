// 00:35:09

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] ranAnswer = {
            { 1, 2, 3, 4, 5 },                // 1번 수포자가 반복할 답
            { 2, 1, 2, 3, 2, 4, 2, 5 },       // 2번 수포자가 반복할 답
            { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }  // 3번 수포자가 반복할 답
        };
        int[] result = { 0, 0, 0 };           // 각 수포자의 정답 수
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == ranAnswer[0][i % 5]) result[0]++;
            if (answers[i] == ranAnswer[1][i % 8]) result[1]++;
            if (answers[i] == ranAnswer[2][i % 10]) result[2]++;
        }
        
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < result.length; i++) {
            if (max == result[i]) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
