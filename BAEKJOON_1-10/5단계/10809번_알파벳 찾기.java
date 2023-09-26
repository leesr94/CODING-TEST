import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for (int i = 0; i < s.length(); i++) {
			// 중복된 문자가 있을 경우 먼저 나오는 인덱스만 저장
			if (arr[s.charAt(i) - 97] != -1) continue;
			
			arr[s.charAt(i) - 97] = i;
		}
		
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
		
	}
}
