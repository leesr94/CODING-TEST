// 00:30:58

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                // 해당 값이 0이면 동작x
                if (board[i][m - 1] == 0) continue;
                
                // 바구니에 같은 인형이 있으면 없애기
                if (!basket.empty() && basket.peek() == board[i][m - 1]) {
                    basket.pop();
                    answer += 2;
                }
                else basket.push(board[i][m - 1]);
                
                // 인형을 빼냈으니 0으로 변경
                board[i][m - 1] = 0;
                break;
            }
        }
        
        return answer;
    }
}
