import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String[] sArr = st.nextToken().split("");
			
			for (int j = 0; j < sArr.length; j++) {
				sArr[j] = sArr[j].repeat(r);
				sb.append(sArr[j]);
			}
			
			sb.append("\n");
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
}
