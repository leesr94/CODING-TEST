class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] text = quiz[i].split(" ");
            // text[0] : 좌변 중 X, text[1] : 좌변 중 부호, text[2] : 좌변 중 Y, text[3] : =, text[4] : 우변의 답
          
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            answer[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return answer;
    }
}
