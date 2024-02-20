import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<>(); 
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			switch (str.charAt(0)) {
				case '1': deque.offerFirst(Integer.parseInt(str.substring(2))); break;
				case '2': deque.offerLast(Integer.parseInt(str.substring(2))); break;
				case '3': sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n"); break;
				case '4': sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n"); break;
				case '5': sb.append(deque.size()).append("\n"); break;
				case '6': sb.append(deque.isEmpty() ? 1 : 0).append("\n"); break;
				case '7': sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n"); break;
				case '8': sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n"); break;
			}
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
