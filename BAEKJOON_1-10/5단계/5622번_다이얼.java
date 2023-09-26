import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int time = 0;
		
		br.close();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(str.charAt(i) + "")) time += j + 3;
			}
		}
		
		System.out.println(time);
		
	}
}
