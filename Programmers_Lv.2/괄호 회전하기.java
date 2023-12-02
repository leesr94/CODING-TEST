import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');  map.put(']', '[');  map.put('}', '{');
        
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) stack.clear();
            
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                
                if (map.containsValue(ch)) stack.push(ch);
                else {
                    if (!stack.isEmpty() && stack.peek() == map.get(ch)) stack.pop();
                    else stack.push(ch);
                }
            }
            
            if (stack.isEmpty()) answer++;
            s = rotation(s);
        }
        
        return answer;
    }
    
    public static String rotation(String s) {
        String tmp = s.substring(0, 1);
        return s.substring(1, s.length()) + tmp;
    }
}
