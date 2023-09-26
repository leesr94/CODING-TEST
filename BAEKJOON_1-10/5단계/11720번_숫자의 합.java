import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sArr = br.readLine().split("");
		int result = 0;
		
		br.close();
		
		for (int i = 0; i < n; i++) {
			result += Integer.parseInt(sArr[i]);
		}
		
		System.out.println(result);
		
	}
}
