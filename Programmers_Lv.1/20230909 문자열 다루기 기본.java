// 00:04:06

class Solution {
    public boolean solution(String s) {
        String str = s.replaceAll("[^0-9]", "");
        return (s.length() == 4 || s.length() == 6) && s.equals(str);
    }
}
