import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int quadrant = 1;
		
		if (x < 0 && y > 0) quadrant = 2;
		if (x < 0 && y < 0) quadrant = 3;
		if (x > 0 && y < 0) quadrant = 4;
		
		System.out.println(quadrant);
		
		sc.close();
		
	}
}
