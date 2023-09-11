// 00:00:52

import java.util.Scanner;
import java.util.stream.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
		
        String str = IntStream.rangeClosed(1,  a * b).mapToObj(i -> i % a == 0 ? "*\n" : "*")
                        .collect(Collectors.joining());
        System.out.println(str);
    }
}
