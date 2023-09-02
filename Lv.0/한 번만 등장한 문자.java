import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        List<String> list = Arrays.asList(s.split(""));
        String str = list.stream().filter(x -> Collections.frequency(list, x) < 2)
                        .sorted().collect(Collectors.joining());
        
        return str;
    }
}
