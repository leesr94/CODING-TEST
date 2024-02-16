import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int x = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			switch (str) {
				case "pop":
					sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					sb.append(queue.isEmpty() ? 1 : 0).append("\n");
					break;
				case "front":
					sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
					break;
				case "back":
					sb.append(queue.isEmpty() ? -1 : x).append("\n");
					break;
				default:
					x = Integer.parseInt(str.split(" ")[1]);
					queue.offer(x);
					break;
			}
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}



// Deque(덱)을 이용한 풀이
/*
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			switch (str) {
				case "pop":
					sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					sb.append(deque.isEmpty() ? 1 : 0).append("\n");
					break;
				case "front":
					sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
					break;
				case "back":
					sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
					break;
				default:
					deque.offerLast(Integer.parseInt(str.split(" ")[1]));
					break;
			}
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
*/
