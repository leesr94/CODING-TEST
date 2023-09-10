import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String grade = "";
		
		switch(score / 10) {
			case 10 : 
			case 9 : 
				grade = "A";
				break;
			case 8 : 
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default : 
				grade = "F";
		}
		
		System.out.println(grade);
		
		sc.close();
		
	}
}
