import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while (!(input = br.readLine()).equals("0")) {
			int num = Integer.parseInt(input);
			int count = 0;
			
			for (int i = num + 1; i <= num * 2; i++) {
				if (isPrime(i)) count++;
			}
			
			sb.append(count + "\n");
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
