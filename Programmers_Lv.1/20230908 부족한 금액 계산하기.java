// 00:10:00

import java.util.stream.*;

class Solution {
    public long solution(int price, int money, int count) {
        long total = (long)LongStream.rangeClosed(1, count).map(i -> price * i).sum();
        
        if (total < money) return 0;	// 가진 돈이 총 이용요금보다 많을 때
        return total - money;
    }
}



// 등차수열의 합공식 사용 -> solution 함수의 매개변수 타입을 long으로 변경해줘야만 가능
//class Solution {
//    public long solution(long price, long money, long count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }
//}
