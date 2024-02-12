import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int k = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 0) stack.pop();
			else stack.push(n);
		}
		
		br.close();
		int sum = (int) stack.stream().mapToInt(i -> i).sum();
		
		System.out.println(sum);
		
	}
}
