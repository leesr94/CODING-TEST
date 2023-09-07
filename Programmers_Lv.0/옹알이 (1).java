class Solution {
    public int solution(String[] babbling) {
        String[] arr = { "aya", "ye", "woo", "ma" };
        int answer = 0;
        
        for (String s : babbling) {
            for (String a : arr) {
            	// babbling의 요소에 arr 요소가 포함된 것을 "1"로 변환
                // 공백문자로 변환 시, "wyeoo" 경우 ye가 먼저 삭제되어 woo가 되어서 발음 가능한 문자열로 취급
                s = s.replace(a, "1");
            }
            
            // 1을 공백으로 변환했을 때, babbling의 요소의 길이가 0이면 +1
            if (s.replace("1", "").length() == 0) answer++;
        }
        
        return answer;
    }
}
