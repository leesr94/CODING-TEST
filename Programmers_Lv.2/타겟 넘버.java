class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        DFS(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void DFS(int[] numbers, int target, int depth, int result) {
        if (depth == numbers.length) {
            if (target == result) answer++;
            return;
        }
        
        int add = result + numbers[depth];
        int sub = result - numbers[depth];
        
        DFS(numbers, target, depth + 1, add);
        DFS(numbers, target, depth + 1, sub);
    }
}
