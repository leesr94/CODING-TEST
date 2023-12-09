import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = m; i <= n; i++) {
			boolean isPrime = (i != 1) ? true : false;
			
			for (int j = 2; j <= (int) Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) list.add(i);
		}
		
		if (list.size() == 0) System.out.println(-1);
		else {
			int sum = list.stream().mapToInt(i -> i).sum();
			
			System.out.println(sum + "\n" + list.get(0));
		}
		
	}
}
