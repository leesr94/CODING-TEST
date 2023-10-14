// 00:46:47

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        // 0 ~ 9까지 숫자가 X와 Y에 몇 개 있는지 판별
        int[] x = new int[10];
        int[] y = new int[10];
        
        // X와 Y를 돌면서 숫자가 있다면 해당 숫자의 개수 증가
        for (int i = 0; i < X.length(); i++) x[X.charAt(i) - '0']++;
        for (int i = 0; i < Y.length(); i++) y[Y.charAt(i) - '0']++;
        
        // 큰 수부터 접근하여 sb 추가
        for (int i = x.length - 1; i >= 0; i--) {
            // 둘 다 0 이상이면 X와 Y에 똑같은 숫자가 하나 이상 존재
            if (x[i] > 0 && y[i] > 0) { // 둘 중 하나라도 0이면 같은 숫자 X
                // 숫자의 개수 감소
                x[i]--;
                y[i]--;
                // X나 Y에 같은 숫자가 여러개 있을 경우, 한 번 저장한 후 한 번 더 해당 인덱스 접근을 위해 i++
                sb.append(i++);
            }
        }
        
        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}
