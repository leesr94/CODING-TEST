import java.io.*;

public class No4779 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = br.readLine()) != null) {
			int n = Integer.parseInt(input);
			int len = (int) Math.pow(3, n);
            //길이가 3^n 이고 '-'로 이루어진 문자열 미리 만들어 놓고, 재귀함수 시작하기 
			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			
			cantorian(0, len); // 시작 인덱스, 시작 길이
			System.out.println(sb.toString());
		}
		
		br.close();
	}

	public static void cantorian(int start, int size) { //시작 인덱스, 문자열 사이즈
		if(size ==1 ) return;
		
		int newSize = size / 3;
        // 3등분한 문자열의 2번째 부분 공백처리
		for(int i = start + newSize; i < start + 2 * newSize; i++) {
			sb.setCharAt(i, ' ');
		}
		
		cantorian(start, newSize); // 3등분한 문자열에서 첫번째 부분
		cantorian(start + 2 * newSize, newSize); // 3등분한 문자열의 세번째 부분 
	}
}