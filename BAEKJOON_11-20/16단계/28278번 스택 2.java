import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			switch (str.charAt(0)) {
				case '1': stack.push(Integer.parseInt(str.substring(2))); break;
				case '2': sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); break;
				case '3': sb.append(stack.size()).append("\n"); break;
				case '4': sb.append(stack.isEmpty() ? 1 : 0).append("\n"); break;
				case '5': sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); break;
			}
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
