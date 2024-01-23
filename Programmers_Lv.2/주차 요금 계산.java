import java.util.*;
import java.text.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, List<String>> map = new TreeMap<>();
        
        for (int i = 0; i < records.length; i++) {
            String[] tmp = records[i].split(" ");
            List<String> list = map.get(tmp[1]);
            
            if (list == null) list = new ArrayList<>();
            list.add(tmp[0]);
            map.put(tmp[1], list);
        }
        
        int[] answer = new int[map.size()];
        int idx = 0;
        
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() % 2 != 0) entry.getValue().add("23:59");
            int diff = 0;
            
            for (int i = 0; i < entry.getValue().size(); i += 2) {
                diff += diffMin(entry.getValue().get(i), entry.getValue().get(i + 1));
            }
            
            int useOfTime = (diff - fees[0] < 0) ? 0 : diff - fees[0];
            int pay = (useOfTime % fees[2] > 0) ? useOfTime / fees[2] + 1 : useOfTime / fees[2];
            answer[idx] = fees[1] + (pay * fees[3]);
            idx++;
        }
        
        return answer;
    }
    
    public static int diffMin(String start, String end) {
        int diff = 0;
        
        try {
            Date time1 = new SimpleDateFormat("HH:mm").parse(start);
            Date time2 = new SimpleDateFormat("HH:mm").parse(end);
            
            diff = (int) ((time2.getTime() - time1.getTime()) / (1000 * 60));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return diff;
    }
}
