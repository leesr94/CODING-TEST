// 00:03:01

class Solution {
    public int[] solution(int n, int m) {
        int max = GDC(n, m);
        int min = n * m / max;
        
        int[] answer = { max, min };
        return answer;
    }
    
    public static int GDC(int a, int b) {
        if (a < b) {		// a가 b보다 작으면 값 변경
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (b != 0) {	// b가 0이 될 때까지 나누기
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}
