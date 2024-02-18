import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		int count = 0;
		
		while (queue.size() != 1) {
			int tmp = queue.poll();
			count++;
			
			if (count % k == 0) sb.append(tmp + ", ");
			else queue.offer(tmp);
		}
		
		sb.append(queue.poll() + ">");
		System.out.println(sb.toString());
		
	}
}
