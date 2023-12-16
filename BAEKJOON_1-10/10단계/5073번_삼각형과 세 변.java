import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			int count = (int) Arrays.stream(arr).distinct().count();
			
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
			else if (arr[2] >= arr[0] + arr[1]) sb.append("Invalid");
			else {
				if (count == 1) sb.append("Equilateral");
				else if (count == 2) sb.append("Isosceles");
				else sb.append("Scalene");
			}
			sb.append("\n");
		}
		
		br.close();
		
		System.out.println(sb.toString());
		
	}
}
