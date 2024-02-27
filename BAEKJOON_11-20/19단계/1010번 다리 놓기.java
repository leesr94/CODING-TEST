import java.io.*;
import java.util.*;

public class Main {
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int result = combination(m, n);
			sb.append(result + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
	
	public static int combination(int m, int n) {
		if (dp[m][n] > 0) return dp[m][n];
		
		if (m == n || n == 0) return dp[m][n] = 1;
		
		return dp[m][n] = combination(m - 1, n - 1) + combination(m - 1, n);
	}
}
