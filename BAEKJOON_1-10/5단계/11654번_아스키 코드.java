import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch = br.readLine().charAt(0);
		br.close();
		
		System.out.println(ch - 0);
		
	}
}
