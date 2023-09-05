class Solution {
    public int solution(int[] common) {
    	  // 등차수열인지 등비수열인지 판단 (true면 등차, false면 등비)
        boolean result = common[1] - common[0] == common[2] - common[1];
        
        if (result) {
            return common[common.length - 1] + (common[1] - common[0]);
        }
        
        return common[common.length - 1] * (common[1] / common[0]);
    }
}
