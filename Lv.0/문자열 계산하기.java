import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.replace(" ", "").replace("-", "+-").split("\\+");
        
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}
