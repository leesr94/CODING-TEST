import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int max = 0;
		int min = 1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i : arr) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}
		
		System.out.println(min + " " + max);


    // ------- 배열 정렬을 통한 최대 최소 구하기
    //StringTokenizer st = new StringTokenizer(br.readLine());
		//for (int i = 0; i < n; i++) {
		//	arr[i] = Integer.parseInt(st.nextToken());
		//}
		
		//Arrays.sort(arr);
		//System.out.println(arr[0] + " " + arr[n - 1]);
    
		
		br.close();
		
	}
}
