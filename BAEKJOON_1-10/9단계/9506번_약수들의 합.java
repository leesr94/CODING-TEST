import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new TreeSet<>();
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			int sum = 1;
			
			if (n == -1) break;
			
			for (int i = 2; i <= n; i++) {
				if (n % i == 0 && i != n) {
					set.add(i);
					sum += i;
				}
			}
			
			if (sum != n) sb.append(n + " is NOT perfect.");
			else {
				sb.append(n + " = 1");
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					sb.append(" + " + it.next());
				}
			}
			
			sb.append("\n");
			set.clear();
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
