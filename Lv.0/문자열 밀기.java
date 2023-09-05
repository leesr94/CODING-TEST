class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        
        int cnt = 0;
        while(cnt <= A.length()) {
            A = A.substring(A.length() - 1, A.length()) + A.substring(0, A.length() - 1);
            cnt++;
            if (A.equals(B)) return cnt;
        }
        
        return -1;
    }
}


// 다른 사람 풀이
class Solution {
    public int solution(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }
}
