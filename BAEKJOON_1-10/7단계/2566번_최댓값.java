import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[9][9];
		int[] max = { 0, 1, 1 };	// 최댓값, i행, j열
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if (max[0] <= arr[i][j]) {
					max[0] = arr[i][j];
					max[1] = i + 1;
					max[2] = j + 1;
				}
			}
		}
		
		br.close();
		
		System.out.println(max[0] + "\n" + max[1] + " " + max[2]);
		
	}
}
