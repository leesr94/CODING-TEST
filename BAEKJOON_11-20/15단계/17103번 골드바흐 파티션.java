import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		boolean[] notPrimeArr = isNotPrime();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			
			for (int j = 2; j <= n / 2; j++) {
				if (!notPrimeArr[j] && !notPrimeArr[n - j]) count++;
			}
			
			sb.append(count + "\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
	
	public static boolean[] isNotPrime() {
		boolean[] notPrimeArr = new boolean[1000001];
		
		for (int i = 2; i < notPrimeArr.length; i++) {
			if (!notPrimeArr[i]) {
				for (int j = i * 2; j < notPrimeArr.length; j += i) {
					notPrimeArr[j] = true;
				}
			}
		}
		
		return notPrimeArr;
	}
}
