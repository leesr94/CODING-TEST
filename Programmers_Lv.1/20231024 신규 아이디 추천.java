// 00:31:23

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();                              // 1단계
        answer = answer.replaceAll("[^a-z|0-9|\\-\\_\\.]", "");     // 2단계
        answer = answer.replaceAll("[\\.]{2,}", ".");               // 3단계
        answer = answer.replaceAll("^[\\.]|[\\.]$", "");            // 4단계
        if (answer.equals("")) answer = "a";                        // 5단계
        if (answer.length() >= 16) answer = answer.substring(0, 15);
        answer = answer.replaceAll("[\\.]$", "");                   // 6단계
        if (answer.length() <= 2) {                                 // 7단계
            int len = answer.length();
            String s = String.valueOf(answer.charAt(len - 1));
            
            answer += s.repeat(3 - len);
        }
        
        return answer;
    }
}
