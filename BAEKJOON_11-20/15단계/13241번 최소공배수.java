import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		br.close();
		
		long max = GCD(a, b);
		
		System.out.println(a * b / max);
	}
	
	public static long GCD(long a, long b) {
		if (a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b != 0) {
			long tmp = a % b;
			a = b;
			b = tmp;
		}
		
		return a;
	}
}
