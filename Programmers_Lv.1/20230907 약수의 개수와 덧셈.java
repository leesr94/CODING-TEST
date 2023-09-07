// 00:18:53

import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        int[] arr = IntStream.rangeClosed(left, right).map(i -> i).toArray();
        
        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) cnt++;
            }
            
            if (cnt % 2 != 0) arr[i] *= -1;
        }
        
        return (int)Arrays.stream(arr).sum();
    }
}
