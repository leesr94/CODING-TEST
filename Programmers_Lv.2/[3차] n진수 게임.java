class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int turnAll = 0;
        int turnP = p;
        
        for (int i = 0; i <= t * m; i++) {
            String tmp = Integer.toString(i, n).toUpperCase();
            
            for (int j = 0; j < tmp.length(); j++) {
                turnAll++;
                
                if (turnAll == turnP) {
                    sb.append(tmp.substring(j, j + 1));
                    
                    if (sb.length() == t) break;
                    
                    turnP += m;
                }
            }
        }
        
        return sb.toString();
    }
}



// 실행속도 줄이기
/*
class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbP = new StringBuilder();
        int start = 0;

        while (sbA.length() < m * t) {
            sbA.append(Integer.toString(start++, n).toUpperCase());
        }

        for (int i = 0; i < t; i++) {
            sbP.append(sbA.charAt(p - 1 + i * m));
        }

        return sbP.toString();
    }
}
*/
