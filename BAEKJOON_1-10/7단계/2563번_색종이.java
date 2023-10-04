import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int area = 0;
		boolean[][] arr = new boolean[100][100];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) area++; arr[j][k] = true;
				}
			}
		}
		
		br.close();
		
		System.out.println(area);
		
	}
}
