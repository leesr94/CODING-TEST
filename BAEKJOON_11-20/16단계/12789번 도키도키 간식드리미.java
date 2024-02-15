import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		
		if (isPossible(arr)) sb.append("Nice");
		else sb.append("Sad");
		
		System.out.println(sb.toString());
		
	}
	
	public static boolean isPossible(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		int turn = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == turn) turn++;
			else {
				if (stack.isEmpty() || stack.peek() != turn) stack.push(arr[i]);
				else {
					stack.pop();
					turn++;
					i--;
				}
			}
		}
		
		for (int i = 0; i < stack.size(); i++) {
			int tmp = stack.pop();
			
			if (tmp == turn) turn++;
			else return false;
		}
		
		return true;
	}
}
