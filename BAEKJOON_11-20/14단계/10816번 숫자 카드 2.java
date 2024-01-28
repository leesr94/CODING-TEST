import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String card = st.nextToken();
			map.put(card, map.getOrDefault(card, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			String card = st.nextToken();
			sb.append(map.getOrDefault(card, 0) + " ");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
