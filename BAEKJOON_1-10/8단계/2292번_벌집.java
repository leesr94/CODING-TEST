import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 0;
		int num = 2;
		
		if (n == 1) System.out.println(1);
		else {
			while (num <= n) {
				num = num + (cnt * 6);
				cnt++;
			}
			
			System.out.println(cnt);
		}
		
	}
}
