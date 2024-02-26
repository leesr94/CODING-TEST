import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		else return n * factorial(n - 1);
	}
}
