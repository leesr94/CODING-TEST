import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        String be = Arrays.stream(before.split("")).sorted().collect(Collectors.joining());
        String af = Arrays.stream(after.split("")).sorted().collect(Collectors.joining());
        
        return be.equals(af) ? 1 : 0;
    }
}
