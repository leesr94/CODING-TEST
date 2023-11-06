class Solution {
    public int[] solution(String s) {
        int[] answer = { 0, 0 };
        
        while (!s.equals("1")) {
            answer[0]++;
            int len = s.replace("0", "").length();
            answer[1] += s.length() - len;
            
            s = Integer.toBinaryString(len);
        }
        
        return answer;
    }
}
