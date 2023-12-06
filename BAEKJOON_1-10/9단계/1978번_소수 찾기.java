import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			if (tmp == 1 || tmp == 0) continue;
			
			for (int j = 2; j <= (int) Math.sqrt(tmp); j++) {
				if (tmp % j == 0) cnt++; 
			}
			
			if (cnt == 0) answer++;
		}
		
		br.close();
		System.out.println(answer);
		
	}
}
