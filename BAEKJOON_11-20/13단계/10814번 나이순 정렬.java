import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Map<Integer, List<String>> map = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			List<String> list = map.get(age);
			
			if (list == null) list = new ArrayList<>();
			list.add(name);
			map.put(age, list);
		}
		
		br.close();
		
		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
			for (String s : entry.getValue()) {
				sb.append(entry.getKey() + " " + s + "\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
