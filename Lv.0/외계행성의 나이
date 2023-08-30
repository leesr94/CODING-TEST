import java.util.stream.*;

class Solution {
    public String solution(int age) {
        return String.valueOf(age).chars()
                .mapToObj(i -> String.valueOf((char)(i + 49)))	// i + 49 = 'a'-'0'이 49이기 때문
                .collect(Collectors.joining());
    }
}
