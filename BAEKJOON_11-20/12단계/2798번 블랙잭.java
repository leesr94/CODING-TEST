import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] cards = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		System.out.println(method(cards, m));
		
	}
	
	public static int method(int[] cards, int m) {
		int max = 0;
		
		for (int i = 0; i < cards.length - 2; i++) {
			for (int j = i + 1; j < cards.length - 1; j++) {
				for (int k = j + 1; k < cards.length; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					
					if (sum <= m) max = Math.max(max, sum);
					if (max == m) return max;
				}
			}
		}
		
		return max;
	}
}
