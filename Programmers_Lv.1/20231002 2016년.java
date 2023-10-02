// 00:20:41

class Solution {
    public String solution(int a, int b) {
        // 1월 1일이 금요일, 날짜를 7로 나눈 나머지 1이 금요일이므로 나머지가 0이면 목요일
        String[] days = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        // 윤년이므로 2월은 29일
        int[] mon = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        for (int i = 0; i < a - 1; i++) {
            b += mon[i];
        }
        System.out.println(b % 7);
        
        return days[b % 7];
    }
}
