import java.io.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int tmp = (int) Math.pow(2, n) - 1;
		sb.append(tmp + "\n");
		
		hanoiTower(n, 1, 2, 3);
		System.out.println(sb.toString());
		
	}
	
	public static void hanoiTower(int n, int start, int tmp, int end) {
		if (n == 1) {
			sb.append(start + " " + end).append("\n");
			return;
		}
		
		hanoiTower(n - 1, start, end, tmp);
		
		sb.append(start + " " + end).append("\n");
		
		hanoiTower(n - 1, tmp, start, end);
	}
}
