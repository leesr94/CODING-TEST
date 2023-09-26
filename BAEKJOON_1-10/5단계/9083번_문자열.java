import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			String tmp = br.readLine();
			sb.append(tmp.charAt(0));
			sb.append(tmp.charAt(tmp.length() - 1));
			sb.append("\n");
		}
		
		br.close();
		System.out.println(sb);
		
	}
}
