// 00:53:22

class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] arr = new String[park.length][];
        int[] answer = { 0, 0 };
        int h = park.length;
        int w = park[0].length();
        
        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].split("");
            
            if (park[i].indexOf("S") != -1) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }
        
        for (String r : routes) {
            String nswe = r.split(" ")[0];
            int len = Integer.parseInt(r.split(" ")[1]);
            int newy = answer[0];
            int newx = answer[1];
            
            for (int i = 0; i < len; i++) {
                if (nswe.equals("N")) newy--;
                if (nswe.equals("S")) newy++;
                if (nswe.equals("W")) newx--;
                if (nswe.equals("E")) newx++;
                
                if (newy >= 0 && newx >= 0 && newy < h && newx < w) {
                    if (arr[newy][newx].equals("X")) break;
                    if (i == len - 1) {
                        answer[0] = newy;
                        answer[1] = newx;
                    }
                }
            }
        }
        
        return answer;
    }
}
