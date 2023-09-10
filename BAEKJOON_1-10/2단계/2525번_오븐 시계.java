import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a * 60 + b + c;   // 시작 시간을 분으로 변경한 값에 필요한 시간 더하기
		a = (min / 60) % 24;        // 23시를 초과할 경우 다시 0이 되므로, 24시간을 나눈 나머지가 시
		b = min % 60;			          // 분
		
		System.out.println(a + " " + b);
		
		sc.close();
		
	}
}
