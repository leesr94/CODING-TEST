import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		br.close();
		
		int[] arr = IntStream.range(1, n + 1).map(i -> i).toArray();
		boolean[] visited = new boolean[n];
		
		combination(arr, visited, 0, m);
		
		System.out.println(sb.toString());
		
	}
	
	public static void combination(int[] arr, boolean[] visited, int idx, int m) {
		if (m == 0) {
			for (int i = 0; i < arr.length; i++) {
				if (visited[i]) sb.append(arr[i] + " ");
			}
			sb.append("\n");
		}
		
		for (int i = idx; i < arr.length; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, m - 1);
			visited[i] = false;
		}
	}
}
