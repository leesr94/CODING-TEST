class Solution {
    public static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        check(dungeons, visited, k, 0);
        
        return answer;
    }
    
    public static void check(int[][] dungeons, boolean[] visited, int k, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                check(dungeons, visited, k - dungeons[i][1], cnt + 1);
                visited[i] = false;
            }
        }
        
        answer = Math.max(answer, cnt);
    }
}
