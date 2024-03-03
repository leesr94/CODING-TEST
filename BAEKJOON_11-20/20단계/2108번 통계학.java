import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		int[] modeArr = new int[8001];		// 최빈값을 구하기 위한 배열
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			list.add(tmp);
			modeArr[tmp + 4000]++;
		}
		
		br.close();
		Collections.sort(list);
		int modeMax = 0;
		int mode = 0;
		boolean bool = false;
		
		for (int i = 0; i < modeArr.length; i++) {
			if (modeArr[i] > modeMax) {
				mode = i - 4000;
				modeMax = modeArr[i];
				bool = true;
			} else if (modeArr[i] == modeMax && bool) {
				mode = i - 4000;
				bool = false;
			}
		}
		
		int sum = list.stream().mapToInt(i -> i).sum();
		int size = list.size();
		
		sb.append(Math.round((double) sum / size)).append("\n");
		sb.append(list.get(size / 2)).append("\n");
		sb.append(mode).append("\n");
		sb.append(list.get(size - 1) - list.get(0));
		
		System.out.println(sb.toString());
		
	}
}