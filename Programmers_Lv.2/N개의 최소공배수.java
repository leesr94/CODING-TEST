import java.util.*;

class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) return arr[0];
        
        Arrays.sort(arr);
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int max = GCD(answer, arr[i]);
            answer = answer * arr[i] / max;
        }
        
        return answer;
    }
    
    // 최대공약수
    public static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}
