class Solution {
    public int[] solution(int money) {
        int[] answer = { money / 5500, money - 5500 * (money / 5500) };
        // int[] answer = { money / 5500, money % 550) };
        return answer;
    }
}