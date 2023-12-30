import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int min = 64;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] chess = new char[n][m];
		
		for (int i = 0; i < n; i++) {
			chess[i] = br.readLine().toCharArray();
		}
		
		br.close();
		
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				chessCheck(i, j, chess);
			}
		}
		
		System.out.println(min);
		
	}
	
	public static void chessCheck(int n, int m, char[][] chess) {
		int count = 0;
		char tmp = chess[n][m];
		
		for (int i = n; i < n + 8; i++) {
			for (int j = m; j < m + 8; j++) {
				if (chess[i][j] != tmp) count++;
				tmp = tmp == 'W' ? 'B' : 'W';
			}
			tmp = tmp == 'W' ? 'B' : 'W';
		}
		
		count = Math.min(count, 64 - count);
		min = Math.min(min,  count);
	}
}
