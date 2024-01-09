import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2000001];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		br.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) sb.append((i - 1000000) + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
