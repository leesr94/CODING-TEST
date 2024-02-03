import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		br.close();
		
		int max = GCD(b, b1);
		int min = b * b1 / max;
		
		int n = (a * (min / b)) + (a1 * (min / b1));
		max = GCD(n, min);
		
		System.out.println((n / max) + " " + (min / max));
	}
	
	public static int GCD(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		
		return a;
	}
}
