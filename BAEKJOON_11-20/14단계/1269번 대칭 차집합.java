import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<Integer, String> map = new TreeMap<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			map.put(Integer.parseInt(st.nextToken()), "A");
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(tmp)) map.put(tmp, "AB");
			else map.put(tmp, "B");
		}
		
		br.close();
		int count = 0;
		
		for (Integer i : map.keySet()) {
			if (!map.get(i).equals("AB")) count++;
		}
		
		System.out.println(count);
		
	}
}
