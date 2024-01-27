import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<Integer, String> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String pokemon = br.readLine();
			map1.put(i + 1, pokemon);
			map2.put(pokemon, i + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			String tmp = br.readLine();
			
			if (tmp.matches("\\d*")) sb.append(map1.get(Integer.parseInt(tmp)) + "\n");
			else sb.append(map2.get(tmp) + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
