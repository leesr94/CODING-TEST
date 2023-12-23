import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			int num = i;
			int sum = 0;
			
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if (sum + i == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
	}
}
