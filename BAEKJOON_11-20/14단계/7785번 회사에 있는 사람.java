import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String record = st.nextToken();
			
			map.put(name, record);
		}
		
		br.close();
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals("enter")) sb.append(entry.getKey() + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
