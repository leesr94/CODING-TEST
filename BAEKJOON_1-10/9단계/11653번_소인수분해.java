import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		int i = 2;
		
		while (n >= i) {
			if (n % i == 0) {
				sb.append(i + "\n");
				n /= i;
			} else i++;
		}
		
		System.out.println(sb.toString());
		
	}
}
