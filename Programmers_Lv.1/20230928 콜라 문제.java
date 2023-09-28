// 00:34:03

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while ((n / a) > 0) {
            answer += (n / a) * b;
            n = ((n / a) * b) + (n % a);
        }
        
        return answer;
    }
}



// 합공식 사용
/*
class Solution {
    public int solution(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
*/
