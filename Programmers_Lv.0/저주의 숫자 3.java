import java.util.*;

class Solution {
    public int solution(int n) {
        List<String> list = new ArrayList<String>();
        
        for(int i = 1; ; i++) {
            if ((i + "").contains("3") || i % 3 == 0) continue; 
            list.add(i + "");
            
            if (list.size() == n) break;
        }
        
        return Integer.parseInt(list.get(n - 1));
    }
}
