import java.io.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		
		StringBuilder sb = new StringBuilder(Stream.of(n.split("")).sorted().collect(Collectors.joining()));
		
		System.out.println(sb.reverse().toString());
		
	}
}
