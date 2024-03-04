import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			
			if (word.length() >= m) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}
		
		br.close();
		
		List<String> keySet = new ArrayList<>(map.keySet());
		Collections.sort(keySet, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (Integer.compare(map.get(s1), map.get(s2)) != 0) 
					return Integer.compare(map.get(s2), map.get(s1));
				
				if (s1.length() != s2.length()) 
					return s2.length() - s1.length();
				
				return s1.compareTo(s2);
			}
		});
		
		for (String key : keySet) {
			sb.append(key + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
