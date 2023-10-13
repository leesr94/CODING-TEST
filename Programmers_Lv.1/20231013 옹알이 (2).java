// 00:42:07

class Solution {
    public int solution(String[] babbling) {
        String[] arr = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String tmp = arr[j].repeat(2);
                
                if (!babbling[i].contains(tmp)) babbling[i] = babbling[i].replace(arr[j], " ");
            }
            
            if (babbling[i].replace(" ", "").length() == 0) answer++;
        }
        
        return answer;
    }
}
