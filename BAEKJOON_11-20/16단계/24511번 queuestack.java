import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] typeArr = new int[n];
		
		for (int i = 0; i < n; i++) {
			typeArr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (typeArr[i] == 0) deque.offerLast(tmp);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			deque.offerFirst(tmp);
			sb.append(deque.pollLast() + " ");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
