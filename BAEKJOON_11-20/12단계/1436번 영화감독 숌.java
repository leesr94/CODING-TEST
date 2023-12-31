import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		
		while (count != n) {
			num++;
			
			if (Integer.toString(num).contains("666")) count++; 
		}
		
		System.out.println(num);
		
	}
}
