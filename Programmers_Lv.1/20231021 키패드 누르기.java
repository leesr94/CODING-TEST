// 00:31:50

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            
            if (n == 1 || n == 4 || n == 7) {
                left = n;
                answer += "L";
            } else if (n == 3 || n == 6 || n == 9) {
                right = n;
                answer += "R";
            } else {
                if (n == 0) n = 11;
                
                int absL = (Math.abs(n - left) / 3) + (Math.abs(n - left) % 3);
                int absR = (Math.abs(n - right) / 3) + (Math.abs(n - right) % 3);
                
                if (absL < absR) {
                    left = n;
                    answer += "L";
                } else if (absL > absR) {
                    right = n;
                    answer += "R";
                } else {
                    if (hand.equals("left")) {
                        left = n;
                        answer += "L";
                    } else {
                        right = n;
                        answer += "R";
                    }
                }
            }
            
        }
        
        return answer;
    }
}
