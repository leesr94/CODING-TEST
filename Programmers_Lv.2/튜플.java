import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.substring(2, s.length() - 2).split("\\},\\{");
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int[] tmp = Arrays.stream(arr[i].split(",")).mapToInt(Integer::parseInt).toArray();
            
            for (int t : tmp) {
                if (!set.contains(t)) answer[i] = t;
                set.add(t);
            }
        }
        
        return answer;
    }
}
