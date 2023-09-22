import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[30];
		
    // 입력한 번호에서 -1 하면 arr 배열의 인덱스이므로 해당 인덱스의 값을 true로 변경
		for (int i = 0; i < 28; i++) {
			arr[Integer.parseInt(br.readLine()) - 1] = true;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
        	// 해당 값이 false이면 리턴 (i는 인덱스이므로 +1)
			if (arr[i] == false) sb.append((i + 1) + " ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}
