import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int [n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		for (int a = 0; a < m; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;	// 바구니 번호 - 1 = 바구니 배열 인덱스
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			sb.append(i + " ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}
