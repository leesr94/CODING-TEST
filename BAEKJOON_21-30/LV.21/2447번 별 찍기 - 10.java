import java.io.*;

public class Main {
	static char array[][];
	
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		array = new char[n][n];
		
		getStars(0, 0, n, false);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(array[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static void getStars(int nx, int ny, int n, boolean bool) {
		if (bool) {
			for (int i = nx; i < nx + n; i++) {
				for (int j = ny; j < ny + n; j++) {
					array[i][j] = ' ';
				}
			}
			return;
		}
		
		if (n == 1) {
			array[nx][ny] = '*';
			return;
		}
		
		int block = n / 3;
		int blockCnt = 0;
		
		for (int i = nx; i < nx + n; i += block) {
			for (int j = ny; j < ny + n; j += block) {
				blockCnt++;
				
				if (blockCnt == 5) getStars(i, j, block, true);
				else getStars(i, j, block, false);
			}
		}
	}
}
