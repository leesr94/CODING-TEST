import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : set) {
			sb.append(i + "\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
