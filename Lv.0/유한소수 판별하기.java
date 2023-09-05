class Solution {
    public int solution(int a, int b) {
        int bGDC = b / GDC(a, b);
        
        while (bGDC != 1) {
            if (bGDC % 2 == 0) bGDC /= 2;
            else if (bGDC % 5 == 0) bGDC /= 5;
            else return 2;
        }
        
        return 1;
    }
    
    public static int GDC(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
}
