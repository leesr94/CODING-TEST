import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);    fibo.add(1);    fibo.add(1);
        
        for (int i = 3; i <= n; i++) {
            int tmp = (fibo.get(i - 2) + fibo.get(i - 1)) % 1234567;
            fibo.add(tmp);
        }
        
        return fibo.get(n);
    }
}



// List 사용 x
/*
class Solution {
    public int solution(int n) {
        int answer = 1;
        int f1 = 0;
        int f2 = 1;

        for(int i = 2; i <= n; i++){
            answer = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = answer;
        }
        
        return answer;
    }
}
*/
