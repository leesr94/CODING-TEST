// 00:42:52

class Solution {
    static int answer = 0;
    
    public int solution(int[] number) {
        boolean[] bool = new boolean[number.length];
        combination(number, bool, 0, 3);
        
        return answer;
    }
    
    public static void combination(int[] number, boolean[] bool, int idx, int n) {
        if (n == 0) {
            int result = 0;
            
            for (int i = 0; i < number.length; i++) {
                if (bool[i]) result += number[i];
            }
            
            if (result == 0) answer++;
            
            return;
        }
        
        if (idx == number.length) return;
        
        bool[idx] = true;
        combination(number, bool, idx + 1, n - 1);
        
        bool[idx] = false;
        combination(number, bool, idx + 1, n);
    }
}
