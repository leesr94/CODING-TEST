// 00:07:09

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] cArr = s.toCharArray();
        int[] pAndY = { 0, 0 };
        
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == 'p' || cArr[i] == 'P') {
                pAndY[0]++;
            }
            if (cArr[i] == 'y' || cArr[i] == 'Y') {
                pAndY[1]++;
            }
        }
        
        answer = (pAndY[0] == pAndY[1] ? true : false);

        return answer;
    }
}
