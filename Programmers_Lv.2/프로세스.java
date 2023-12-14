import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> prQue = new LinkedList<>();
        Queue<Integer> loQue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            prQue.add(priorities[i]);
            loQue.add(i);
        }

        while (prQue.peek() != null) {
            int prVal = prQue.poll();
            int loVal = loQue.poll();

            if (prQue.stream().filter(i -> prVal < i).count() == 0) {
                list.add(loVal);
            } else {
                prQue.add(prVal);
                loQue.add(loVal);
            }
        }

        return list.indexOf(location) + 1;
    }
}
