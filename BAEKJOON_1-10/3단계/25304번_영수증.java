import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int n = sc.nextInt();
		long sum = 0;
		
		for (int i = 1; i <= n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			sum += (a * b);
		}
		
		System.out.println(x == sum ? "Yes" : "No");
		
		sc.close();
		
	}
}
