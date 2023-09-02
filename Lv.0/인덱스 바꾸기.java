class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] myArr = my_string.split("");
        String tmp = myArr[num1];
        myArr[num1] = myArr[num2];
        myArr[num2] = tmp;
        
        return String.join("", myArr);
    }
}


// stream 사용 - swap()
import java.util.*;
import java.util.Collections;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        List<String> myArr = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(myArr, num1, num2);
        
        return String.join("", myArr);
    }
}
