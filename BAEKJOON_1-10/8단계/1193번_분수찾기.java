import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		br.close();
		
		int lineCnt = 1;
		int prevLineCnt = 0;
		
		while (true) {
			if (x <= prevLineCnt + lineCnt) {
				if (lineCnt % 2 == 0) System.out.println((x - prevLineCnt) + "/" + (lineCnt - (x - prevLineCnt - 1)));
				else System.out.println((lineCnt - (x - prevLineCnt - 1)) + "/" + (x - prevLineCnt));
				break;
			} else {
				prevLineCnt += lineCnt;
				lineCnt++;
			}
		}
		
	}
}
