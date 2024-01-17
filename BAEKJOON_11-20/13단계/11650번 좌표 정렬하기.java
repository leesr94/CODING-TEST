import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, List<Integer>> map = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			List<Integer> list = map.get(x);
			
			if (list == null) list = new ArrayList<>();
			list.add(y);
			map.put(x, list);
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			Collections.sort(entry.getValue());
			
			for (Integer i : entry.getValue()) {
				sb.append(entry.getKey() + " " + i + "\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
