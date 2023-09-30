// 00:21:31

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        // 점수를 정렬할 List 생성
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder()); // 점수 내림차순 정렬
            
            // k번째까지는 마지막 인덱스의 값이 최저점수이므로 저장
            if (i < k) answer[i] = list.get(list.size() - 1);
            // k번째 이후에는 항상 (k - 1)번째 인덱스 값을 저장
            else answer[i] = list.get(k - 1);
        }
        
        return answer;
    }
}



// 우선순위 큐 (PriorityQueue) 사용
/*
import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }
        
        return answer;
    }
}
*/
