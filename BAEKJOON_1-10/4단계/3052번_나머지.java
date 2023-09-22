import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		br.close();
		
    // 중복 제거 후 개수 반환
		System.out.println(Arrays.stream(arr).distinct().count());
		
	}
}
