// 00:17:31

import java.util.*;

class Solution {
    // 조합으로 뽑은 3개의 수를 더한 값을 저장할 list 생성
    static List<Integer> list = new ArrayList<Integer>();
    
    public int solution(int[] nums) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        combination(nums, stack, 0, 3);
        
        // list의 값이 소수인지 판별
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            
            for (int j = 1; j <= (int)Math.sqrt(list.get(i)); j++) {
                if (list.get(i) % j == 0) cnt++;
            }
            
            if (cnt == 1) answer++;
        }
        
        return answer;
    }
    
    // Stack을 사용한 조합 메서드
    public static void combination(int[] nums, Stack<Integer> stack, int idx, int r) {
        if (stack.size() == r) {
            int tmp = 0;
            for (int i : stack) {
                tmp += i;
            }
            list.add(tmp);
            return;
        }
        
        for (int i = idx; i < nums.length; i++) {
            stack.push(nums[i]);
            combination(nums, stack, i + 1, r);
            stack.pop();
        }
    }
}
