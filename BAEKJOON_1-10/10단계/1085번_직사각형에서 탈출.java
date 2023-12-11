import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		br.close();
		
		int xmin = Math.min(Math.abs(x - w), Math.abs(x - 0));
		int ymin = Math.min(Math.abs(y - h), Math.abs(y - 0));
		
		System.out.println(Math.min(xmin, ymin));
		
	}
}
