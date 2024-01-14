import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) continue;
			
			for (int j = 0; j < arr[i]; j++) {
				sb.append(i + "\n");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
