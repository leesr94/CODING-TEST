import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			map.put(Integer.parseInt(st.nextToken()), 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(tmp)) sb.append(1 + " ");
			else sb.append(0 + " ");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
