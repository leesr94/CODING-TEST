import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String[] nStr = my_string.replaceAll("[^0-9]", "").split("");
        Arrays.sort(nStr);
        
        return Arrays.stream(nStr).mapToInt(Integer::parseInt).toArray();
    }
}
