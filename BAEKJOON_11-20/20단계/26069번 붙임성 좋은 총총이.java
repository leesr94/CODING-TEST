import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		set.add("ChongChong");
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String first = st.nextToken();
			String second = st.nextToken();
			
			if (set.contains(first)) 		set.add(second);
			else if (set.contains(second)) 	set.add(first);
		}
		
		br.close();
		System.out.println(set.size());
		
	}
}
