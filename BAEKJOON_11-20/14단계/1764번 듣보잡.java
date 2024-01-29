import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), 1);
		}
		
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
			
			if (map.get(name) == 2) count++;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		sb.append(count + "\n");
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (map.get(entry.getKey()) == 2) sb.append(entry.getKey() + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
