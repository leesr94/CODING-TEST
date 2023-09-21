import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
    // 한 줄에 띄어쓰기로 여러개 입력받기 위한 객체
    StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		
    // 개행 하기 위해 한 번 더 선언
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i : a) {
			if (i < x) sb.append(i + " ");
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
		
	}
}
