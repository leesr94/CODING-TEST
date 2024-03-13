import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		br.close();
		
		int[] arr = IntStream.range(1, n + 1).map(i -> i).toArray();
		int[] result = new int[n];
		boolean[] visited = new boolean[n];
		
		permutation(arr, result, visited, 0, n, m);
		
		System.out.println(sb.toString());
		
	}
	
	public static void permutation(int[] arr, int[] result, boolean[] visited, int depth, int n, int m) {
		if (depth == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				result[depth] = arr[i];
				permutation(arr, result, visited, depth + 1, n, m);
				visited[i] = false;
			}
		}
	}
}