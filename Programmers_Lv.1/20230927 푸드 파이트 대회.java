// 00:10:35

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            // i번째 음식의 수가 1개면 넘김
            if (food[i] < 2) continue;
            
            int tmp = food[i] / 2;              // i번째 음식을 2로 나눈 몫 저장
            answer += (i + "").repeat(tmp);     // i번째 음식식을 나눈 몫만큼 반복해서 저장
        }
        
        // 한 명의 선수가 먹는 순서에 물을 더해 reverse()
        StringBuffer sb = new StringBuffer(answer + "0").reverse();
        answer += sb.toString();
        
        return answer;
    }
}



// 이중 for문 사용법 - 실행속도 느림
/*
class Solution {
    public String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i; 
            }
        }

        return answer;
    }
}
*/
