// 00:24:15

class Solution {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        
        for (int i : ingredient) {
            sb.append(i);
            
            if (sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.setLength(sb.length() - 4);
            }
        }
        
        return answer;
    }
}
