// 00:30:42

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx = -1;		// 공백 이외의 각 문자의 인덱스 역할 변수
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(" ")) idx = -1;	// 공백문자는 -1
            if (!arr[i].equals(" ")) idx++;	// 공백 외의 문자는 0부터 카운트
            
            if (idx % 2 == 0) arr[i] = arr[i].toUpperCase();
            else arr[i] = arr[i].toLowerCase();
            
            answer += arr[i];
        }
        
        return answer;
    }
}
