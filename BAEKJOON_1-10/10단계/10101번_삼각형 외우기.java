import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		int sum = 0;
		String result = "";
		
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		br.close();
		
		if (sum != 180) result = "Error";
		else {
			int cnt = (int) Arrays.stream(arr).distinct().count();
			
			if (cnt == 1) result = "Equilateral";
			else if (cnt == 2) result = "Isosceles";
			else result = "Scalene";
		}
		
		System.out.println(result);
		
	}
}
