import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strRev = new StringBuilder(str).reverse().toString();
		int result = 0;
		br.close();
		
		if (str.equals(strRev)) result = 1;
		
		System.out.println(result);
		
	}
}
