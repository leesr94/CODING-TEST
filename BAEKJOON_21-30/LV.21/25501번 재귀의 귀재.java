import java.io.*;

public class Main {
	static int count = 0;
	
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			sb.append(isPalindrome(s) + " " + count).append("\n");
			count = 0;
		}
		
		br.close();
		System.out.println(sb.toString());
		
	}
	
	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
	
	public static int recursion(String s, int idx, int len) {
		count++;
		
		if (idx >= len) return 1;
		else if (s.charAt(idx) != s.charAt(len)) return 0;
		else return recursion(s, idx + 1, len - 1);
	}
}