import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer a = new StringBuffer(st.nextToken()).reverse();
		StringBuffer b = new StringBuffer(st.nextToken()).reverse();
		
		br.close();
		
		int aNum = Integer.parseInt(a.toString());
		int bNum = Integer.parseInt(b.toString());
		
		System.out.println(Math.max(aNum, bNum));
		
	}
}
