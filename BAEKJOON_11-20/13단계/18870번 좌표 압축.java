import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] arrSort = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arrSort[i] = arr[i];
		}
		
		br.close();
		Arrays.sort(arrSort);
		Map<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		
		for (int a : arrSort) {
			if (!map.containsKey(a)) {
				map.put(a, cnt);
				cnt++;
			}
		}
		
		for (int a : arr) {
			sb.append(map.get(a) + " ");
		}
		
		System.out.println(sb.toString());
		
	}
}
