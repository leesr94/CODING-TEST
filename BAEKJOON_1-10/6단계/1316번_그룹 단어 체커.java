import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = n;	// 그룹 단어의 개수 저장 변수(초기값 단어 개수 전체)
		
		for (int i = 0; i < n; i++) {
			boolean[] arr = new boolean[26];
			String str = br.readLine();
			arr[str.charAt(0) - 97] = true;		// 입력된 단어의 첫번째 글자 true로 저장
			
			for (int j = 1; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				// 앞의 문자와 현재 문자가 같으면 통과
				if (ch == str.charAt(j - 1)) continue;
				else {	// 앞의 문자와 현재 문자가 다를 때,
						// 만약 현재 문자가 앞에서 등장했다면(arr[현재문자] 값이 true라면)
					if (arr[ch - 97]) {
						cnt--;		// 그룹 단어의 개수에서 제외
						break;		// 반복 종료. 다음 단어로
					}
					
					arr[ch - 97] = true;	// 현재 문자는 새로 등장했으므로 arr값 ture로 변경
				}
			}
		}
		
		br.close();
		System.out.println(cnt);
		
	}
}
