import java.io.*;

public class Main {
	static int count;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		arr = new int[n];
		nQueen(n, 0);
		System.out.println(count);
		
	}
	
	public static void nQueen(int n, int idx) {
		if (idx == n) {
			count++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[idx]= i;
			if (isPossible(idx)) nQueen(n, idx + 1);
		}
	}
	
	public static boolean isPossible(int num) {
		for (int i = 0; i < num; i++) {
			if (arr[num] == arr[i]) return false;
			else if (Math.abs(num - i) == Math.abs(arr[num] - arr[i])) return false;
		}
		
		return true;
	}
}
