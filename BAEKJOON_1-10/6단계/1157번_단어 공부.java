import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		br.close();
		
		for (int i = 0; i < str.length(); i++) {
			arr[(int)(str.charAt(i) - 65)]++;
		}
		
		int max = -1;
		char ch = ' ';
		
		if (str.length() == 1) ch = str.charAt(0); 
				
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ch = (char)(i + 65);
			} else if (max == arr[i]) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}
}
