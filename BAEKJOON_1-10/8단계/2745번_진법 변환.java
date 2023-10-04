import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		
		br.close();
		
		System.out.println(Integer.parseInt(n, b));
		
	}
}



// 다른 풀이
/*
public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int result = 0;
		int tmp = 1;
		
		br.close();
		
		for (int i = n.length() - 1; i >= 0; i--) {
			char ch = n.charAt(i);
			
			if (Character.isUpperCase(ch)) result += (ch - 55) * tmp;
			result += (ch - '0') * tmp;
			tmp *= b;
		}
		
		System.out.println(Integer.parseInt(n, b));
		
	}
}
*/
