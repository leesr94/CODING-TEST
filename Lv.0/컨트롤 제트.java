import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        
        return IntStream.range(0, arr.length)
            .map(i -> arr[i].equals("Z") ? Integer.parseInt(arr[i - 1]) * -1 : Integer.parseInt(arr[i]))
            .sum();
    }
}



// 다른 사람 풀이 - stack 활용 (실행속도 줄어듦)
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
