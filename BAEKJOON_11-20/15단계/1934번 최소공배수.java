import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int max = GCD(a, b);
			int min = a * b / max;
			
			sb.append(min + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
	}
	
	public static int GCD(int a, int b) {
		if (a > b) {
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
