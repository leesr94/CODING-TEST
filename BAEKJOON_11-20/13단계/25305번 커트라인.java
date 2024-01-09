import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<Integer> score = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			score.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(score, Collections.reverseOrder());
		
		System.out.println(score.get(k - 1));
		
	}
}
