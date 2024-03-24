import java.io.*;

public class Main {
	static int reflexiveCnt = 0;
	static int dynamicCnt = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		reflexiveFibo(n);
		dynamicFibo(n);
		
		System.out.println(reflexiveCnt + " " + dynamicCnt);
		
	}
	
	public static int reflexiveFibo(int n) {
		if (n == 1 || n == 2) {
			reflexiveCnt++;
			
			return 1;
		}
		else return (reflexiveFibo(n - 1) + reflexiveFibo(n - 2));
	}
	
	public static void dynamicFibo(int n) {
		int[] fibo = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			if (i <= 2) fibo[i] = 1;
			else {
				dynamicCnt++;
				
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
		}
	}
}
