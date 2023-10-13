// 00:42:24

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] arr = { 6, 6, 5, 4, 3, 2, 1 };
        int max = 0;
        int min = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                max++;
                continue;
            }
            
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                }
            }
        }
        
        return new int[] { arr[max], arr[min] };
    }
}
