import java.util.*;

class Solution {
    static int answer = -1;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { -1, 1, 0, 0 };
    static boolean[][] visited;
    
    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        
        BFS(maps, 0, 0);
        
        return answer;
    }
    
    public static void BFS(int[][] maps, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { x, y, 1 });
        visited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int tmp[] = queue.poll();
            x = tmp[0];
            y = tmp[1];
            int count = tmp[2];
            
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                answer = count;
                break;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx < 0 || nx >= maps.length || ny < 0 || ny >= maps[0].length || maps[nx][ny] == 0) continue;
                if (!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    queue.add(new int[] { nx, ny, count + 1 });
                }
            }
        }
    }
}
