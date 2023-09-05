class Solution {
    public String solution(String polynomial) {
        // x는 1x로 변경 후, " + "를 기준으로 배열에 담기
        String[] arr = polynomial.replaceAll("\\bx", "1x").split(" \\+ ");
        int coe = 0;    // 계수
        int con = 0;    // 상수
        
        for (String s : arr) {
            if (s.contains("x")) {		                            // 해당 값에 "x"가 포함 되어있으면(x 동일항이면)
                coe += Integer.parseInt(s.replaceAll("x", ""));		// x 제거 후 coe에 누적합
                continue;
            } else {					                                    // 상수라면
                con += Integer.parseInt(s);		                    // con에 누적합
                continue;
            }
        }
        
        if (coe == 0) return "" + con;			                    // x항이 없을 때
        if (coe == 1) return (con == 0) ? "x" : "x + " + con;	  // x항의 계수가 1일 때, 상수도 없으면 "x", 있으면 상수까지
        if (con == 0) return coe + "x";			                    // 상수가 없을 때
        return coe + "x + " + con;			                        // x항과 상수 모두 있을 때
    }
}
