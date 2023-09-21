import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = arr[0];
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) {
				max = arr[i];
				idx = i + 1;      // 인덱스가 아니라 자리값을 구하기 위해서 +1
			}
		}
		
		System.out.println(max + "\n" + idx);
		
		br.close();
		
	}
}
