class Solution {
    public int solution(int n) {
        int answer = n;
        int originBit = Integer.bitCount(n);
        
        while (true) {
            int nextBit = Integer.bitCount(++answer);
            
            if (originBit == nextBit) break;
        }
        
        return answer;
    }
}
