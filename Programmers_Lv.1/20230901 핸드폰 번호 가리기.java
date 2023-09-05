// 00:34:58

class Solution {
    public String solution(String phone_number) {
        String[] pArr = phone_number.split("");
        String answer = "";
        
        for (int i = 0; i < pArr.length; i++) {
            if (i < pArr.length - 4) answer += "*";
            if (i >= pArr.length - 4) answer += pArr[i];
        }
        
        return answer;
    }
}
