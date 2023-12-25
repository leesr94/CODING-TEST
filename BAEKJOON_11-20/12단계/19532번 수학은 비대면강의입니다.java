import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append((c * e - b * f) / (a * e - b * d));
		sb.append(" ");
		sb.append((c * d - a * f) / (b * d - a * e));
		
		System.out.println(sb.toString());
		
	}
}
