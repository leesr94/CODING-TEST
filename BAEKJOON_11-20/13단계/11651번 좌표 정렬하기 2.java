import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] coordinate = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			coordinate[i][0] = Integer.parseInt(st.nextToken());
			coordinate[i][1] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		Arrays.sort(coordinate, (c1, c2) -> {
			if (c1[1] == c2[1]) return c1[0] - c2[0];
			else return c1[1] - c2[1];
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			sb.append(coordinate[i][0] + " " + coordinate[i][1] + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
