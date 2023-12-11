import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		System.out.println(arrMin(xArr) + " " + arrMin(yArr));
		
	}
	
	public static int arrMin(int[] arr) {
		if (arr[0] == arr[1]) return arr[2];
		else if (arr[0] == arr[2]) return arr[1];
		else return arr[0];
	}
}



// Map을 이용한 풀이
/*
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> xMap = new HashMap<>();
		Map<Integer, Integer> yMap = new HashMap<>();
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			xMap.put(x, xMap.getOrDefault(x, 0) + 1);
			yMap.put(y, yMap.getOrDefault(y, 0) + 1);
		}
		
		br.close();
		
		System.out.println(mapMin(xMap) + " " + mapMin(yMap));
		
	}
	
	public static int mapMin(Map<Integer, Integer> map) {
		int result = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == Collections.min(map.values())) result = entry.getKey();
		}
		
		return result;
	}
}
*/
