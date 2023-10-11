// 00:42:52

class Solution {
    public int solution(String dartResult) {
        // 10점을 임시로 A로 변환 후, 한글자씩 잘라 배열에 저장
        String[] arr = dartResult.replace("10", "A").split("");
        int[] score = { 0, 0, 0 };  // 각 기회의 점수를 저장할 배열
        int idx = -1;               // score의 인덱스 변수
        
        for (int i = 0; i < arr.length; i++) {
            // arr에 저장된 값이 A면 10으로 변환
            String s = arr[i].equals("A") ? "10" : arr[i];
            
            // s가 숫자일 경우
            if (s.matches("\\d*")) {
                idx++;  // score 인덱스 증가
                score[idx] = Integer.parseInt(s);   // score에 숫자로 형변환 하여 저장
            }
            // s가 보너스일 경우
            else if (s.matches("[S|D|T]")) {
                if (s.equals("S")) score[idx] = (int) Math.pow(score[idx], 1);
                else if (s.equals("D")) score[idx] = (int) Math.pow(score[idx], 2);
                else if (s.equals("T")) score[idx] = (int) Math.pow(score[idx], 3);
            }
            // s가 옵션일 경우
            else {
                if (s.equals("*")) {
                    score[idx] *= 2;    // 해당 점수 2배
                    // 두번째 이후에 나타날 경우, 직전의 점수도 2배
                    if (idx - 1 >= 0) score[idx - 1] *= 2;
                }
                else if (s.equals("#")) score[idx] *= -1;
            }
        }
        
        return score[0] + score[1] + score[2];
    }
}
