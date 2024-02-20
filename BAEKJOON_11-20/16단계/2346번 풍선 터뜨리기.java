import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<int[]> list = new ArrayList<>();
		int idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			int[] arr = { i, Integer.parseInt(st.nextToken()) };
			list.add(arr);
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		while (list.size() != 1) {
			int next = list.get(idx)[1];
			int size = list.size() - 1;
			
			sb.append(list.get(idx)[0] + " ");
			list.remove(idx);
			
			if (next > 0) next--;
			idx = (idx + next) % size;
			if (idx < 0) idx += size;
		}
		
		sb.append(list.get(0)[0]);
		System.out.println(sb.toString());
		
	}
}
