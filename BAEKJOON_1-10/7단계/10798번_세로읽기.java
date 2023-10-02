import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[][] arr = new String[5][15];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.format("%-15s", br.readLine()).split("");
		}
		
		br.close();
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i].equals(" ")) continue;
				sb.append(arr[j][i]);
			}
		}
		
		System.out.println(sb);
		
	}
}
