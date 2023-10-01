import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double scoreSum = 0;
		double total = 0;
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
		
		StringTokenizer st;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if (grade.equals("P")) continue; 
			
			total += score * map.get(grade);
			scoreSum += score;
		}
		
		br.close();
		
		System.out.printf("%.6f", total / scoreSum);
		
	}
}
