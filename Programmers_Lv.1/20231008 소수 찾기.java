// 00:12:59

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];  // 0 ~ n까지 개수를 위해 n + 1로 크기 할당
        
        Arrays.fill(prime, true);     // 모두 true로 초기화
        prime[0] = prime[1] = false;  // 0과 1은 소수가 아니므로 false
        
        // 2부터 n의 제곱근까지의 수의 배수는 모두 소수가 아님
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (prime[i]) {
                // i는 일단 소수이므로, i의 제곱은 소수가 아님
                // i만큼 더해지면 i의 배수이므로 소수가 아님
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) answer++;
        }
        
        return answer;
    }
}
