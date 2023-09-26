import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		while ((str = br.readLine()) != null && !str.isEmpty()) {
			sb.append(str + "\n");
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
}
