class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            int cnt = 0;
            
            for (int j = 0; j < spell.length; j++) {
                if (!dic[i].contains(spell[j])) break;
                else cnt++;
            }
            
            if (cnt == spell.length) return 1;
        }
        
        return 2;
    }
}
