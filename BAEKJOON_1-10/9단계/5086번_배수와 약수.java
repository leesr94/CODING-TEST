import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		StringBuilder sb = new StringBuilder();
		
		while ((input = br.readLine()) != null) {
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			
			if (a == 0 && b == 0) break;
			
			if (b % a == 0) sb.append("factor\n");
			else if (a % b == 0) sb.append("multiple\n");
			else sb.append("neither\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
}
