import java.io.*;
import java.util.*;

public class Main {
	static int[] tmp;
	static int count = 0;
	static int k = 0;
	static int result = -1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	// 배열크기
		k = Integer.parseInt(st.nextToken());		// 저장 횟수
		
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];		// 입력받는 배열
		tmp = new int[n];		// 오름차순 저장 배열
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		merge_sort(a, 0, n - 1);
		System.out.println(result);
		
	}
	
	// 오름차순 정렬
	public static void merge_sort(int a[], int p, int r) {
		if (count > k) return;
		if (p < r) {
			int q = (p + r) / 2;
			merge_sort(a, p, q);		// 전반부
			merge_sort(a, q + 1, r);	// 후반부
			merge(a, p, q, r);			// 병합
		}
	}
	
	// 병합
	public static void merge(int a[], int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int l = 0;
		
		while (i <= q && j <= r) {
			if (a[i] < a[j]) tmp[l++] = a[i++];
			else tmp[l++] = a[j++];
		}
		
		// 전반부가 남는 경우
		while (i <= q) {
			tmp[l++] = a[i++];
		}
		
		// 후반부가 남는 경우
		while (j <= r) {
			tmp[l++] = a[j++];
		}
		
		i = p;
		l = 0;
		
		// 결과 저장
		while (i <= r) {
			count++;
			
			if (count == k) {
				result = tmp[l];
				break;
			}
			
			a[i++] = tmp[l++];
		}
	}
}
