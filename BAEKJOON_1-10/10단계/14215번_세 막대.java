import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(arr);
		int sum = 0;
		
		if (arr[0] + arr[1] > arr[2]) sum = arr[0] + arr[1] + arr[2];
		else sum = 2 * (arr[0] + arr[1]) - 1;
		
		System.out.println(sum);
		
	}
}
