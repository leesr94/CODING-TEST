import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(') stack.push(s.charAt(j));
				else {
					if (stack.empty()) {
						stack.push(s.charAt(j));
						break;
					}
					else stack.pop();
				}
			}
			
			if (stack.empty()) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
