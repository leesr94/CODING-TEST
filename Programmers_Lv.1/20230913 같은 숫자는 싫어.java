// 00:26:55

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int tmp = -1;	// 비교를 위해 임시로 저장할 변수
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                list.add(arr[i]);
                tmp = arr[i];
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
