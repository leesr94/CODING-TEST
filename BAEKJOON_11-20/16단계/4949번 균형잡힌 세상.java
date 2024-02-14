import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');		map.put(']', '[');
		
		String input = "";
		
		while (!(input = br.readLine()).equals(".")) {
			String str = input.replaceAll("[^\\(|^\\)|^\\[|^\\]]", "");
			Stack<Character> stack = new Stack<>();
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if (map.containsValue(ch)) stack.push(ch);
				else {
					if (!stack.isEmpty() && stack.peek() == map.get(ch)) stack.pop();
					else stack.push(ch);
				}
			}
			
			if (stack.isEmpty()) sb.append("yes\n");
			else sb.append("no\n");
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
}
