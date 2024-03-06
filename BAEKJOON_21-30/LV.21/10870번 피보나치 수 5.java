import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] fibo = new int[n + 1];
		br.close();
		
		for (int i = 1; i <= n; i++) {
			if (i < 3) fibo[i] = 1;
			else fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		
		System.out.println(fibo[n]);
		
	}
}