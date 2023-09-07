class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        // lines 원소의 모든 범위가 -100 ~ 100 이므로 사이즈 200의 배열 생성
        int[] arr = new int[200];
        
        for (int i = 0; i < lines.length; i++) {
        	// lines의 요소 a부터 b까지 반복하며 값을 1 씩 증가
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                arr[j]++;
            }
        }
        
        // 다시 arr의 요소를 모두 반복하여 값이 2 이상이 있다면 answer 증가
        for (int i : arr) {
            if (i > 1) answer++;
        }
        
        return answer;
    }
}
