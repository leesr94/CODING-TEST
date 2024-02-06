import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i = m; i <= n; i++) {
			if (i != 1 && isPrime(i)) sb.append(i + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}
}
