// 00:13:43

class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;		// 가로길이 중 최대값
        int hMax = 0;		// 세로길이 중 최대값
        
        for (int i = 0; i < sizes.length; i++) {
        	// 가로보다 세로가 길면 값 변경
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            wMax = wMax < sizes[i][0] ? sizes[i][0] : wMax;
            hMax = hMax < sizes[i][1] ? sizes[i][1] : hMax;
        }
        
        return wMax * hMax;
    }
}
