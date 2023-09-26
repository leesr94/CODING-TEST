import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt() - 1;	// i번째 글자의 인덱스는 i - 1
		
		sc.close();
		
		System.out.println(s.charAt(i));
		
	}
}
