import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		
		int result = (int) Math.pow(2, n) + 1;
		
		System.out.println(result * result);
		
	}
}
