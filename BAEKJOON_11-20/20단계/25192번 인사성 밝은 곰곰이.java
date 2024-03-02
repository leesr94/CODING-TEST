import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			String nickname = br.readLine();
			
			if (nickname.equals("ENTER")) {
				set.clear();
				continue;
			}
			
			if (!set.contains(nickname)) {
				set.add(nickname);
				count++;
			}
		}
		
		br.close();
		System.out.println(count);
		
	}
}
