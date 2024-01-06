import java.util.*;

class Solution {
    static List<String> list = new ArrayList<>();
    static String[] vowels = { "A", "E", "I", "O", "U" };
    
    public int solution(String word) {
        DFS("", 0);
        
        return list.indexOf(word);
    }
    
    public static void DFS(String str, int idx) {
        list.add(str);
        
        if (idx == 5) return;
        
        for (int i = 0; i < 5; i++) {
            DFS(str + vowels[i], idx + 1);
        }
    }
}
