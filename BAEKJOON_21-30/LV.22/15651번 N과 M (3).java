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
		int[] result = new int[m];
		
		permutations(arr, result, 0);
		
		System.out.println(sb.toString());
		
	}
	
	public static void permutations(int[] arr, int[] result, int idx) {
		if (idx == result.length) {
			for (int i = 0; i < result.length; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			result[idx] = arr[i];
			permutations(arr, result, idx + 1);
		}
	}
}
