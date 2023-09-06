import java.util.*;

class Solution {
    public int solution(int[][] board) {
    	  // 지뢰가 있는 장소의 좌표를 가지는 List (지뢰 개수를 알 수 없으므로)
        List<int[]> bombP = new ArrayList<int[]>();
        
        // 임시로 3*3 크기의 지역 중 가장자리에 지뢰가 없다는 가정 하에,
        // 지뢰를 중심(1, 1)으로 인접하는 타일(위험지역) 8개의 x좌표와 y좌표의 각 배열
        int[] x = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int[] y = { -1, -1, -1, 0, 0, 1, 1, 1 };
        
        // 지뢰의 좌표를 가지는 배열을 List에 추가
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int[] tmp = { i, j };
                    bombP.add(tmp);
                }
            }
        }
        
        // 지뢰 개수만큼 반복문
        for (int i = 0; i < bombP.size(); i++) {
            int px = bombP.get(i)[0];	// 지뢰의 x좌표
            int py = bombP.get(i)[1];	// 지뢰의 y좌표
            
            // 최대 8개인 위험지역을 고르기 위한 반복문
            for (int k = 0; k < 8; k++) {
            	  // 지뢰의 좌표와 위험지역의 각 좌표를 더했을 때,
                // 가장자리(x좌표가 0이거나 2, y좌표가 0이거나 1)가 아닌 공간이라면...
                if (px + x[k] >= 0 && py + y[k] >= 0 && px + x[k] <= board.length - 1 && py + y[k] <= board.length - 1) {
                    // 기존 n*n 배열의 지뢰와 인접하는 위험지역의 값을 0에서 1로 변경
                    board[px + x[k]][py + y[k]] = 1;
                }
            }
        }
        
        // 2차원 배열을 flatMap으로 1차원으로 바꾼 후, 0의 개수(안전한 지대)를 count()로 반환
        return (int)Arrays.stream(board).flatMapToInt(Arrays::stream)
        				.filter(i -> i == 0).count();
    }
}
