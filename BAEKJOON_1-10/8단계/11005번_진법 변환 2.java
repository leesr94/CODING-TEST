import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		br.close();
		
		while (n > 0) {
			// n을 b로 나눈 나머지가 0 ~ 9라면 10진수이므로 바로 저장
			// 아니라면 n % b에 10을 빼고 char 변환을 위해 'A' 더하기
			if (n % b < 10) sb.append(n % b);
			else sb.append((char)((n % b - 10) + 'A'));
			
			n /= b;
		}
		
		// reverse() 하지 않을 경우 거꾸로 출력됨
		System.out.println(sb.reverse());
		
	}
}
