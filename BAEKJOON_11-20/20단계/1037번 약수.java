import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list.add(tmp);
		}
		
		br.close();
		Collections.sort(list);
		
		System.out.println(list.get(0) * list.get(list.size() - 1));
		
	}
}



// 다른 풀이
/*
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min = 1000000;
		int max = 1;
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			min = Math.min(min, tmp);
			max = Math.max(max, tmp);
		}
		
		br.close();
		
		System.out.println(min * max);
		
	}
}


import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			list.add(tmp);
		}
		
		br.close();
		
		int min = Collections.min(list);
		int max = Collections.max(list);
		
		System.out.println(min * max);
		
	}
}
*/
