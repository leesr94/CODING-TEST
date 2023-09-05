class Solution {
    public int solution(int[][] dots) {
        int[] max = { dots[0][0], dots[0][1] };
        int[] min = { dots[0][0], dots[0][1] };
        
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                max[0] = max[0] > dots[i][0] ? max[0] : dots[i][0];
                min[0] = min[0] < dots[i][0] ? min[0] : dots[i][0];
                max[1] = max[1] > dots[i][1] ? max[1] : dots[i][1];
                min[1] = min[1] < dots[i][1] ? min[1] : dots[i][1];
            }
        }
        
        return (max[0] - min[0]) * (max[1] - min[1]);
    }
}
