import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int maxIdx = IntStream.range(0, array.length).filter(i -> max == array[i]).findFirst().orElse(-1);
        int[] answer = { max, maxIdx };
        return answer;
    }
}
