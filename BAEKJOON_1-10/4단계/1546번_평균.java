import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double max = arr[0];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			max = Math.max(max, arr[i]);
		}
		
		double sum = 0.0;
		
		for (double d : arr) {
			d = d / max * 100;
			sum += d;
		}
		
		System.out.println(sum / n);
		
		br.close();
		
	}
}
