import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> words = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if (!words.contains(s)) words.add(s);
		}
		
		br.close();
		
		Comparator<String> com = (String s1, String s2) -> {
			if (s1.length() == s2.length()) return s1.compareTo(s2);
			return s1.length() - s2.length();
		};
		Collections.sort(words, com);
		StringBuilder sb = new StringBuilder();
		
		for (String w : words) {
			sb.append(w + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
