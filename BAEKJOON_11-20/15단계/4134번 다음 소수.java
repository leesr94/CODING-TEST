import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			
			while (!isPrime(num)) {
				num++;
			}
			
			sb.append(num + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
	
	public static boolean isPrime(long num) {
		if (num < 2) return false;
		
		for (long i = 2; i <= (int) Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}
}
