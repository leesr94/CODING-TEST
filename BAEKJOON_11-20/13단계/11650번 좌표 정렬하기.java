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



// 람다식을 이용한 풀이
/*
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] coordinate = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			coordinate[i][0] = Integer.parseInt(st.nextToken());
			coordinate[i][1] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		Arrays.sort(coordinate, (c1, c2) -> {
			if (c1[0] == c2[0]) return c1[1] - c2[1];
			else return c1[0] - c2[0];
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(coordinate[i][0] + " " + coordinate[i][1] + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
*/
