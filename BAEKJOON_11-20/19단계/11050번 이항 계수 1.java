import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		br.close();
		// nCr = n! / (r! * (n - r)!)
		int factN = factorial(n);
		int factR = factorial(k);
		int factNR = factorial(n - k);
		
		System.out.println(factN / (factR * factNR));
		
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		else return n * factorial(n - 1);
	}
}
