import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Solution {
    public int solution(int[] array) {
    	  // array를 stream<String>으로 변환 후 Map의 key로 저장하면서 중복값의 개수를 value에 저장
        Map<String, Integer> map = Arrays.stream(array).mapToObj(i -> Integer.toString(i))
            .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
      
        // map의 value(중복 개수) 중 가장 큰 값
        Integer max = Collections.max(map.values());
        int answer = 0;		  // key를 파싱 후 저장할 변수
        int cnt = 0;		    // value(중복 개수)가 동일할 때를 카운팅하는 변수
        
        for (String key : map.keySet()) {
            if (map.get(key).equals(max)) {	      // key로 value의 값을 가져와 max와 같은지 비교
                answer = Integer.parseInt(key);	  // 같으면 answer에 key를 파싱하여 저장
                cnt++;
                if (cnt > 1) return -1;		        // max값이 여러개 있을 때 -1을 반환
            }
        }
        
        return answer;
    }
}
