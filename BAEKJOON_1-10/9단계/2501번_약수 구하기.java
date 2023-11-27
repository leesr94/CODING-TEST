import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		br.close();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				list.add(i);
				if (n / i != i) list.add(n / i);
			}
		}
		
		Collections.sort(list);
		
		if (list.size() < k) System.out.println(0);
		else System.out.println(list.get(k - 1));
		
	}
}
