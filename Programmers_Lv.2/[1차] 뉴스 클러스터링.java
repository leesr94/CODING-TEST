import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = changeToList(str1);
        List<String> list2 = changeToList(str2);
        
        int answer = (int) jaccard(list1, list2);
        return answer;
    }
    
    public static List<String> changeToList(String s) {
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i < s.length(); i++) {
            String tmp = s.substring(i - 1, i + 1);
            
            if (tmp.matches("^[a-zA-Z]*$")) list.add(tmp.toLowerCase());
        }
        
        return list;
    }
    
    public static double jaccard(List<String> list1, List<String> list2) {
        List<String> inter = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        for (String s : list1) {
            if (list2.contains(s)) {
                inter.add(s);
                list2.remove(s);
            }
            union.add(s);
        }
        
        for (String s : list2) {
            union.add(s);
        }
        
        if (union.size() == 0) return 65536;
        return (double) inter.size() / union.size() * 65536;
    }
}
