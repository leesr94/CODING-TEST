import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int i, int j, int k) {
        String str = IntStream.rangeClosed(i, j)
                            .mapToObj(s -> Integer.toString(s))
                            .collect(Collectors.joining());
        
        return str.length() - str.replace(k + "", "").length();
    }
}
