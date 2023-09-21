import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		while (m > 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
            
			// 인덱스를 구하기 위해 각 바구니의 번호에서 -1
			for (int a = i - 1; a <= j - 1; a++) {
				arr[a] = k;
			}
			
			m--;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			sb.append(i + " ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}
