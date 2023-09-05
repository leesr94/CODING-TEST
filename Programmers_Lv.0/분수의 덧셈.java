class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gdc = GDC(denom1, denom2);		// 최대공약수
        int lcm = denom1 * denom2 / gdc;	// 최소공배수
        
        // 분모를 최소공배수로 통분 후 연산
        int n = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
        int d = lcm;
      
        // 기약분수로 만들기 위해 연산 후의 분모 분자의 최대공약수 구하기
        gdc = GDC(n, d);
        
        int[] answer = { n, d };	// 연산 후 최대공약수가 1이면 기약분수이므로 바로 저장
        
        // 최대공약수가 1이 아니면 약분 가능한 분수이므로 최대공약수로 약분 후 저장
        if (gdc != 1) answer[0] = n / gdc; answer[1] = d / gdc;
        return answer;
    }
    
    public static int GDC(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}
