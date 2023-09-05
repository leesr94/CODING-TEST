import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency).boxed()
                                .sorted(Collections.reverseOrder()).collect(Collectors.toList());
        
        return Arrays.stream(emergency).map(i -> list.indexOf(i) + 1).toArray();
    }
}
