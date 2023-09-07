// 00:04:12

import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
    }
}
