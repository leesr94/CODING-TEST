import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {
			h = h == 0 ? 23 : h - 1;
			m = 60 - (45 - m);
		} else {
			m = m - 45;
		}
		
		System.out.println(h + " " + m);
		
		sc.close();
		
	}
}
