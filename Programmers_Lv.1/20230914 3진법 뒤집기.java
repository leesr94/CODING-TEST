//00:05:32

class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer(Integer.toString(n, 3));
        String reverse = sb.reverse().toString();
        
        return Integer.parseInt(reverse, 3);
    }
}
