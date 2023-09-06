import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
    	// num이 홀수라면 int[]의 중간 값은 항상 (total / num)
        if (num % 2 != 0) return IntStream.range(0, num).map(i -> (total / num) + (i - num / 2)).toArray();
        
        // num이 짝수라면 int[]의 (num / 2)번 째 인덱스의 값은 항상 (int)(total / num)
        return IntStream.range(0, num).map(i -> (total / num) + (i - num / 2) + 1).toArray();
    }
}
