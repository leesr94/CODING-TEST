class Solution {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        String answer = "";
        
        for (String s : arr) {
            if (s.equals("0")) answer += "5";
            if (s.equals("2")) answer += "0";
            if (s.equals("5")) answer += "2";
        }
        
        return answer;
    }
}
