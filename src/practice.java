import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산하실 초: "); 
		int su = sc.nextInt();
		
		int hour =  su / 3600;
		int seconds = su%3600;
		
		int minute = seconds/60;
		seconds = seconds%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.",su,hour,minute,seconds);
		
	}
}

