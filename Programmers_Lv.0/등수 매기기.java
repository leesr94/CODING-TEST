import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> avg = IntStream.range(0, score.length)
                                .mapToObj(i -> score[i][0] + score[i][1])
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            answer[i] = avg.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}
