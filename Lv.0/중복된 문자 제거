import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());


        // Set - LinkedHashSet (중복 허용x, 순서o) 이용한 풀이
        //Set<String> mySet = new LinkedHashSet<String>(Arrays.asList(my_string.split("")));
        //return String.join("", mySet);
    }
}
