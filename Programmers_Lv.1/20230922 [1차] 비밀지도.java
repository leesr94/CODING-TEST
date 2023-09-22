class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] tmp1 = new String[n][n];
        String[][] tmp2 = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            tmp1[i] = String.format("%" + n + "s", Long.toString(arr1[i], 2)).split("");
            tmp2[i] = String.format("%" + n + "s", Long.toString(arr2[i], 2)).split("");
            answer[i] = "";
            
            for (int j = 0; j < n; j++) {
                if (tmp1[i][j].equals("1") || tmp2[i][j].equals("1")) answer[i] += "#";
                else answer[i] += " ";
            }
        }
        
        return answer;
    }
}



// 속도 향상
//class Solution {
//  public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
        
//        for (int i = 0; i < n; i++) {
//            answer[i] = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
//            answer[i] = answer[i].substring(answer[i].length() - n);
//            answer[i] = answer[i].replaceAll("1", "#");
//            answer[i] = answer[i].replaceAll("0", " ");
//        }

//        return answer;
//    }
//}
