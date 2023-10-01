// 00:32:09

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;       // cards1의 인덱스 저장 변수
        int idx2 = 0;       // cards2의 인덱스 저장 변수
        
        for (String s : goal) {
            // idx1이 cards1의 길이보다 작으면서 cards1의 idx1번 인덱스의 값이 goal의 단어와 같으면 idx1 증가
            if (idx1 < cards1.length && s.equals(cards1[idx1])) idx1++;
            
            // idx2가 cards2의 길이보다 작으면서 cards2의 idx2번 인덱스의 값이 goal의 단어와 같으면 idx2 증가
            else if (idx2 < cards2.length && s.equals(cards2[idx2])) idx2++;
            
            // 위의 두 조건에 만족하지 못할 경우 cards1와 cards2의 단어(or 순서)로는 goal의 문장 구성X
            else return "No";
        }
        
        return "Yes";
    }
}
