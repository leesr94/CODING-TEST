// 00:03:40

import java.util.stream.*;

class Solution {
    public String solution(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(i -> i % 2 != 0 ? "수" : "박").collect(Collectors.joining());
    }
}
