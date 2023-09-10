import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int money = 0;
		
		// a, b, c가 모두 다른 값
		if (a != b && b != c && a != c) {
			money = Math.max(Math.max(a, b), c) * 100;
		} 
		// a, b, c가 같은 값
		else if (a == b && b == c) {
			money = 10000 + (a * 1000);
		}
		// a, b, c 중 2개만 같은 값
		else {
			if (a == b || a == c) money = 1000 + (a * 100);
			else money = 1000 + (b * 100);
		}
		
		System.out.println(money);
		
		sc.close();
		
	}
}
