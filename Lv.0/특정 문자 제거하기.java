class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] value = my_string.split(letter);
        for (int i = 0; i < value.length; i++) {
            answer += value[i];
        }
    }
}


// 다른 풀이
//class Solution {
//    public String solution(String my_string, String letter) {
//        String answer = my_string.replace(letter, "");
//        
//        return answer;
//    }
//}