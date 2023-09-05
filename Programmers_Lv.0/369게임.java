import java.util.*;

class Solution {
    public int solution(int order) {
        return Arrays.stream(Integer.toString(order).split(""))
                .mapToInt(Integer::parseInt).filter(i -> i != 0 && i % 3 == 0).toArray().length;
    }
}
