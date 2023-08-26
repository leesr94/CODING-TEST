class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        
        for (int i = start_num; i <= end_num; i++) {
            answer[i - start_num] = i;
        }
        
        return answer;
    }
}


// stream을 쓰는 방법 - 실행속도가 늘어나서 효율x
//import java.util.stream.IntStream;

//class Solution {
//    public int[] solution(int start_num, int end_num) {
//        return IntStream.rangeClosed(start_num, end_num).toArray();
//    }
//}
