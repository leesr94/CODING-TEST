import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		int max = 0;
		
		for (int i = 1; i < n; i++) {
			int tmp = arr[i] - arr[i - 1];
			max = GCD(tmp, max);
		}
		
		System.out.println((arr[n - 1] - arr[0]) / max + 1 - n);
		
	}
	
	public static int GCD(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		
		return a;
	}
}
