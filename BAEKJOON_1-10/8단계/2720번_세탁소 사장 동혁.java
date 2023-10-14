import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] coins = { 25, 10, 5, 1 };
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int change = Integer.parseInt(br.readLine());
			
			for (int c : coins) {
				sb.append(change / c + " ");
				change %= c;
			}
			
			sb.append("\n");
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
}
