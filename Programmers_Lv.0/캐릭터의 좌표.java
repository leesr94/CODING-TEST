class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = { 0, 0 };
        
        for (String s : keyinput) {
            switch(s) {
                case "right" :
                    if (answer[0] >= board[0] / 2) continue;
                    answer[0]++;
                    break;
                case "left" :
                    if (answer[0] <= board[0] / 2 * -1) continue;
                    answer[0]--;
                    break;
                case "up" :
                    if (answer[1] >= board[1] / 2) continue;
                    answer[1]++;
                    break;
                case "down" :
                    if (answer[1] <= board[1] / 2 * -1) continue;
                    answer[1]--;
                    break;
            }
        }
        
        return answer;
    }
}
