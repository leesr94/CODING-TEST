import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while (queue.size() != 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		
		br.close();
		System.out.println(queue.peek());
		
	}
}
