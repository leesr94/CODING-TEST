import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String tmp = s.substring(i, j);
				
				map.put(tmp, 1);
			}
		}
		
		System.out.println(map.size());
		
	}
}
