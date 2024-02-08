import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 0;
		
		for (int i = 1; i <= (int) Math.sqrt(n); i++) {
			count++;
		}
		
		System.out.println(count);
		
	}
}
