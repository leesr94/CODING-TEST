// 00:36:06

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        // 중복을 제거한 배열의 길이 저장
        int size = (int) Arrays.stream(nums).distinct().count();
        
        // 최대로 가질 수 있는 수보다 중복 제거한 길이가 길면 max 리턴
        if (max < size) return max;
        return size;
    }
}



// Set 사용
/*
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        if (hs.size() > nums.length / 2) return nums.length / 2;
        return hs.size();
    }
}
*/
