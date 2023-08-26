import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i += 2) {
            oddList.add(i);
        }
        
        return oddList.stream().mapToInt(i -> i).toArray();
    }
}
